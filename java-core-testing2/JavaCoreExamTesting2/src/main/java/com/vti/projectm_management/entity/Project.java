package com.vti.projectm_management.entity;

import java.util.List;

public class Project {
	private int projectId;
	private String projectName;
	private int size;
	private int leaderId;
	private List<Member> employees;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int projectId, String projectName, int size, int leaderId, List<Member> employees) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.size = size;
		this.leaderId = leaderId;
		this.employees = employees;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getLeaderId() {
		return leaderId;
	}

	public void setLeaderId(int leaderId) {
		this.leaderId = leaderId;
	}

	public List<Member> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Member> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", size=" + size + ", leaderId="
				+ leaderId + ", employees=" + employees + "]";
	}

}
