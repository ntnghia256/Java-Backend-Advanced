package com.vti.projectm_management.utils;

public class Validator {
	public static boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        return email != null && email.matches(regex);
    }

    public static boolean isValidPassword(String password) {
        // Từ 6 đến 10 ký tự, ít nhất 1 chữ in hoa
        String regex = "^(?=.*[A-Z]).{6,10}$";
        return password != null && password.matches(regex);
    }

    public static boolean isValidName(String name) {
        // Chỉ chứa chữ cái và khoảng trắng
        String regex = "^[\\p{L} ]+$";
        return name != null && name.matches(regex);
    }
}
