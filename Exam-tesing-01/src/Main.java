import enums.ProSkill;
import services.UserService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService service = new UserService();
		
		// Print all users
		service.printAllUser();
		
		// Create user
		service.createEmployee(4, "Pham Thi D", "ptd@gmail.com", "111", ProSkill.DESIGN);
		service.createAdmin(5, "Phung Thi Thanh Hai", "ptthai@gmail.com", "thanhhai123", 3);
		
		// Print all user after create
		System.out.println("All user after use `create` method");
		service.printAllUser();
		
		// Print user by id
		System.out.println("Find by id");
		service.printUserById(1);
		
		// Delete user
		System.out.println("Delete user by id");
		service.deleteUserById(2);
		
		// Reprint list user
		System.out.println("Reprint list after delete");
		service.printAllUser();
	}

}
