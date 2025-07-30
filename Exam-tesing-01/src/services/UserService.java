package services;

import java.util.ArrayList;
import java.util.List;

import enums.ProSkill;
import models.Admin;
import models.Employee;
import models.User;

public class UserService {
	private List<User> users;
	
	public UserService() {
		users = new ArrayList<>();
		
		// Create 3 user Employee
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setFullname("Nguyen Van A");
		emp1.setEmail("nva@gmail.com");
		emp1.setPassword("123");
		emp1.setProSkill(ProSkill.DESIGN);
		
		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setFullname("Nguyen Van B");
		emp2.setEmail("nvb@gmail.com");
		emp2.setPassword("123");
		emp2.setProSkill(ProSkill.DEV);
		
		Admin admin1 = new Admin();
        admin1.setId(2);
        admin1.setFullname("Trần Thị B");
        admin1.setEmail("b@gmail.com");
        admin1.setPassword("456");
        admin1.setExpInYear(5);
        
        users.add(emp1);
        users.add(emp2);
        users.add(admin1);
	}
	
	public void createEmployee(int id, String fullname, String email, String password, ProSkill proSkill) {
		Employee e = new Employee();
		e.setId(id);
		e.setFullname(fullname);
		e.setEmail(email);
		e.setPassword(password);
		e.setProSkill(proSkill);
		users.add(e);
	}
	
	public void createAdmin(int id, String fullname, String email, String password, int expInYear) {
		Admin a = new Admin();
		a.setId(id);
		a.setFullname(fullname);
		a.setEmail(email);
		a.setPassword(password);
		a.setExpInYear(expInYear);
		users.add(a);
	}
	
	public void printAllUser() {
		System.out.println("List all users: ");
		for (User u : users) {
			System.out.println("ID: " + u.getId() + ", Fullname: " + u.getFullname() + ", Email: " + u.getEmail() + ";");
		}
	}
	
	public void printUserById(int id) {
		System.out.println("List users where id  = " + id);
		for (User u : users) {
			if (u.getId() == id) {
				System.out.println(u.getUserInfo());
			}
		}
	}
	
	public void deleteUserById(int id) {
		boolean removed = users.removeIf(u -> u.getId() == id);
		if (removed) {
			System.out.println("Deleted user have id = " + id);
		} else {
			System.out.println("Can't find any user match with id = " + id);
		}
	}
}
