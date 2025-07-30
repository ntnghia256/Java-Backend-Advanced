package models;

import enums.ProSkill;

public class Employee extends User {
	private ProSkill proSkill;
	
    public ProSkill getProSkill() {
        return proSkill;
    }

    public void setProSkill(ProSkill proSkill) {
        this.proSkill = proSkill;
    }
    
    @Override
    public String getUserInfo() {
        return "Employee [ID=" + id + ", Name=" + fullname + ", Email=" + email + ", Skill=" + proSkill + "]";
    }
}
