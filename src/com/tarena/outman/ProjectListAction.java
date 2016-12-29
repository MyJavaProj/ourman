package com.tarena.outman;

import java.util.List;
import dao.ProjectDao;
import entity.Project;

public class ProjectListAction {
	private List<Project> projectList;

	public String execute() {
		ProjectDao projectDao = new ProjectDao();
		projectList = projectDao.findAll();
		return "success";
	}

	public List<Project> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<Project> projectList) {
		this.projectList = projectList;
	}
}
