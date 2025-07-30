import java.sql.Date;

public class Account {
	private int id;
	private String email;
	private String username;
	private String fullname;
	private Department department;
	private Position position;
	private Date createDate;

	// Constructor
	public Account() {
	}

	public Account(int id, String email, String username, String fullname, Department department, Position position,
			Date createDate) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullname = fullname;
		this.department = department;
		this.position = position;
		this.createDate = createDate;
	}

	// Getter and Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

//	public short getDepartmentId() {
//		return department.getId();
//	}

//	public void setDepartmentId(short departmentId) {
//		this.department = departmentId;
//	}
//
//	public short getPositionId() {
//		return position;
//	}
//
//	public void setPositionId(short positionId) {
//		this.position = positionId;
//	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	@Override
	public String toString() {
		return "Account";
	}
}
