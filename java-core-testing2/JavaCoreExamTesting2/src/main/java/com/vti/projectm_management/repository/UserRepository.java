package com.vti.projectm_management.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.vti.projectm_management.entity.Admin;
import com.vti.projectm_management.entity.Leader;
import com.vti.projectm_management.entity.Member;
import com.vti.projectm_management.entity.User;
import com.vti.projectm_management.utils.DBConnection;

public class UserRepository {
	
	// Login function
	public User login(String email, String password) {
		String sql = "SELECT * FROM users WHERE email = ? AND password = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("full_name");
                String role = rs.getString("role");
                switch (role) {
                    case "LEADER":
                        return getLeaderById(id);
                    case "MEMBER":
                        return getMemberById(id);
                    case "ADMIN":
                        return new Admin(id, name, email, password);
                }
            }
        }
        return null;
	}
	
	public void save(User user) {
		String insertUser = "INSERT INTO users (full_name, email, password, role) VALUES (?, ?, ?, 'MEMBER')";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(insertUser, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, member.getFullName());
            stmt.setString(2, member.getEmail());
            stmt.setString(3, member.getPassword());
            stmt.executeUpdate();

            ResultSet keys = stmt.getGeneratedKeys();
            if (keys.next()) {
                int userId = keys.getInt(1);
                String insertMember = "INSERT INTO members (user_id, skill) VALUES (?, ?)";
                try (PreparedStatement stmt2 = conn.prepareStatement(insertMember)) {
                    stmt2.setInt(1, userId);
                    stmt2.setString(2, member.getSkill());
                    stmt2.executeUpdate();
                }
            }
        }
	}
	
	public List<Member> getMemberByProjectName(String projectName) {
		List<Member> members = new ArrayList<>();
        String sql = "SELECT u.id, u.full_name, u.email, u.password, m.project_id, m.skill FROM users u JOIN members m ON u.id = m.user_id JOIN projects p ON m.project_id = p.project_id WHERE p.project_name = ?";

        try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, projectName);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                members.add(new Member(
                        rs.getInt("id"),
                        rs.getString("full_name"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getInt("project_id"),
                        rs.getString("skill")
                ));
            }
        }
        return members;
	}
	
	public Leader getLeaderByProjectName(String projectName) throws SQLException {
        String sql = "SELECT u.id, u.full_name, u.email, u.password, l.number_of_projects FROM users u JOIN leaders l ON u.id = l.user_id JOIN projects p ON p.leader_id = l.user_id WHERE p.project_name = ?";

        try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, projectName);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Leader(
                        rs.getInt("id"),
                        rs.getString("full_name"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getInt("number_of_projects")
                );
            }
        }
        return null;
    }

    private Leader getLeaderById(int id) throws SQLException {
        String sql = "SELECT * FROM users u JOIN leaders l ON u.id = l.user_id WHERE u.id = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Leader(id, rs.getString("full_name"), rs.getString("email"), rs.getString("password"), rs.getInt("number_of_projects"));
            }
        }
        return null;
    }

    private Member getMemberById(int id) throws SQLException {
        String sql = "SELECT * FROM users u JOIN members m ON u.id = m.user_id WHERE u.id = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Member(id, rs.getString("full_name"), rs.getString("email"), rs.getString("password"), rs.getInt("project_id"), rs.getString("skill"));
            }
        }
        return null;
    }
}
