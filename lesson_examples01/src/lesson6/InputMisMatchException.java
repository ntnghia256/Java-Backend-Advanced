package lesson6;

import java.util.Scanner;

public class InputMisMatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		sc.close();
		
		System.out.println("Your age is: " + age); // 7,1
	}

}
