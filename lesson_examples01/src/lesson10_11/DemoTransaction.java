package lesson10_11;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DemoTransaction {

	private static void deleteTeamAndUser(int team_id) throws ClassNotFoundException, SQLException {
		Connection conn = JDBCUtils.getConnection();
		try {
			conn.setAutoCommit(false); // Bắt đầu transaction

			// Xóa user trước, rồi đến team
			deleteUserByTeamId(conn, team_id);
			deleteTeamById(conn, team_id);

			conn.commit();
			System.out.println("Delete successfully");

		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
			if (conn != null) {
				try {
					conn.rollback();
					System.out.println("Rolled back due to error.");
				} catch (SQLException rollbackEx) {
					System.out.println("Rollback failed: " + rollbackEx.getMessage());
				}
			}
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException closeEx) {
					System.out.println("Close connection failed: " + closeEx.getMessage());
				}
			}
		}
	}

	private static void deleteTeamById(Connection conn, int id) throws SQLException {
		String sql = "DELETE FROM tbl_team WHERE id = ?";
		try (PreparedStatement pre = conn.prepareStatement(sql)) {
			pre.setInt(1, id);
			pre.executeUpdate();
			System.out.println("Deleted team with id = " + id);
		}
	}

	private static void deleteUserByTeamId(Connection conn, int team_id) throws SQLException {
		String sql = "DELETE FROM tbl_user WHERE team_id = ?";
		try (PreparedStatement pre = conn.prepareStatement(sql)) {
			pre.setInt(1, team_id);
			pre.executeUpdate();
			System.out.println("Deleted users with team_id = " + team_id);
		}
	}

	public static void main(String[] args) {
		try {
			deleteTeamAndUser(1);
		} catch (Exception e) {
			System.out.println("Main error: " + e.getMessage());
		}
	}
}
