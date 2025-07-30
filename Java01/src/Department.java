public class Department {
	@SuppressWarnings("unused")
	private int departmentId;
	private String departmentName;
	
	public Department(int departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
}
