package lesson10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DemoCRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			createUser("Nguyen Trong Nghia", "ntnghia256@gmail.com");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.getMessage();
		}

		catch (SQLException e) {
			// TODO: handle exception
			e.getMessage();
		}

		catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
	}

//	public static List<User> getUserList() throws ClassNotFoundException, SQLException {
//		List<User> userList = new ArrayList<User>();
//		
//		String url = "";
//		String user = "root";
//		String password = "root";
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection conn = DriverManager.getConnection(url, user, password);
//		
//		Statement statement = conn.createStatement();
//		
//		String sql = "SELECT * FROM tbl_user";
//		ResultSet rs = sta
//		
//		return userList;
//	}

	public static void createUser(String username, String email) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/user_management_java_exercise_vti?autoReconnect=true&useSSL=false&characterEncoding=latin1";

		String user = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection(url, user, password);

		String sql = "INSERT INTO user (username, email) VALUES (?, ?)";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);

		preparedStatement.setString(1, username);
		preparedStatement.setString(2, email);

		preparedStatement.executeUpdate();

		System.out.println("Add user successfully!");

		conn.close();
	}
}
