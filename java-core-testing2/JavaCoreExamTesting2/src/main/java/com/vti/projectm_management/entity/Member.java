package com.vti.projectm_management.entity;

public class Member extends User {
	private int projectId;
	private String skill;

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member(int projectId, String skill) {
		super();
		this.projectId = projectId;
		this.skill = skill;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Member [projectId=" + projectId + ", skill=" + skill + "]";
	}

}
