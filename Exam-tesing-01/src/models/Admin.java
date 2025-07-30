package models;

public class Admin extends User {
	private int expInYear;
	
    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }
    
    @Override
    public String getUserInfo() {
        return "Admin [ID=" + id + ", Name=" + fullname + ", Email=" + email + ", Exp=" + expInYear + " years]";
    }
}
