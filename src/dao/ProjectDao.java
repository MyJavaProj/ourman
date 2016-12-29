package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.Project;
import util.ConnectionUtils;

public class ProjectDao {
	private static final String findAll = "select id,name,start_date, end_date from t_project";

	private static final String findAll2 = "select id,name,start_date, end_date from t_project limit ?,?";

	public List<Project> findAll(int page, int rowsPerPage) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = ConnectionUtils.openConnection();
			stmt = con.prepareStatement(findAll2);
			stmt.setInt(1, (page - 1) * rowsPerPage);
			stmt.setInt(2, rowsPerPage);
			rs = stmt.executeQuery();
			List<Project> list = new ArrayList<Project>();
			while (rs.next()) {
				Project project = new Project();
				project.setId(rs.getInt(1));
				project.setName(rs.getString(2));
				project.setStartDate(rs.getDate(3));
				project.setEndDate(rs.getDate(4));
				list.add(project);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public List<Project> findAll() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = ConnectionUtils.openConnection();
			stmt = con.prepareStatement(findAll);
			rs = stmt.executeQuery();
			List<Project> list = new ArrayList<Project>();
			while (rs.next()) {
				Project project = new Project();
				project.setId(rs.getInt(1));
				project.setName(rs.getString(2));
				project.setStartDate(rs.getDate(3));
				project.setEndDate(rs.getDate(4));
				list.add(project);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
		ProjectDao dao = new ProjectDao();
//		List<Project> list = dao.findAll();
		List<Project> list = dao.findAll(1, 3);
		for (Project p : list) {
			System.out.println(p.getName());
		}
	}
}
