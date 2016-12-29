package com.tarena.outman;

import java.util.List;
import dao.ProjectDao;
import entity.Project;

public class ProjectListAction {
	//input
	private int page = 1;
	
	//output
	private List<Project> projectList;

	public String execute() {
		ProjectDao projectDao = new ProjectDao();
//		projectList = projectDao.findAll();
		projectList = projectDao.findAll(page, 3);
		return "success";
	}

	public List<Project> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<Project> projectList) {
		this.projectList = projectList;
	}
	
	public int getPage(){return page;}
	public void setPage(int page){this.page = page;}
}
