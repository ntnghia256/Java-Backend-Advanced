package com.vti.projectm_management.entity;

public class Leader extends User {
	private int numberOfProject;

	public Leader() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Leader(int numberOfProject) {
		super();
		this.numberOfProject = numberOfProject;
	}

	public int getNumberOfProject() {
		return numberOfProject;
	}

	public void setNumberOfProject(int numberOfProject) {
		this.numberOfProject = numberOfProject;
	}

	@Override
	public String toString() {
		return "Leader [numberOfProject=" + numberOfProject + "]";
	}
	
	
}
