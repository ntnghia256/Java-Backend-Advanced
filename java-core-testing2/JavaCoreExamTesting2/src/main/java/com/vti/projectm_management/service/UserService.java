package com.vti.projectm_management.service;

import com.vti.projectm_management.entity.User;
import com.vti.projectm_management.repository.UserRepository;
import com.vti.projectm_management.utils.Validator;

public class UserService {
	private UserRepository userRepo = new UserRepository();

    public User login(String email, String password) throws SQLException {
        if (!Validator.isValidEmail(email)) throw new IllegalArgumentException("Email không hợp lệ");
        if (!Validator.isValidPassword(password)) throw new IllegalArgumentException("Password không hợp lệ");
        return userRepo.login(email, password);
    }

    public void createUser(String fullName, String email, String skill) throws SQLException {
        if (!Validator.isValidEmail(email)) throw new IllegalArgumentException("Email không hợp lệ");
        if (!Validator.isValidName(fullName)) throw new IllegalArgumentException("Tên không hợp lệ");

        Member m = new Member();
        m.setFullName(fullName);
        m.setEmail(email);
        m.setPassword("12345678");
        m.setSkill(skill);

        userRepo.save(m);
    }

    public void printUsersInProject(String projectName) throws SQLException {
        List<Member> members = userRepo.getMembersByProjectName(projectName);
        Leader leader = userRepo.getLeaderByProjectName(projectName);

        System.out.println("Project: " + projectName);
        System.out.println("== Leader ==");
        if (leader != null)
            System.out.printf("%-5s %-20s\n", leader.getId(), leader.getFullName());
        else
            System.out.println("Không có leader.");

        System.out.println("== Members ==");
        for (Member m : members) {
            System.out.printf("%-5d %-20s %-15s\n", m.getId(), m.getFullName(), m.getSkill());
        }
    }
}
