package lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InitList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> studentList = new ArrayList<String>();
		studentList.add("trongnghia");
		studentList.add("honguyen");
		
		List<String> testList = Arrays.asList("trnghia", "honguyen");
		
		System.out.println("So phan tu: " + studentList.size());
		System.out.println("Phan tu 1: " + studentList.get(0));
		System.out.println("Mang ban dau: " + studentList);
		
		studentList.remove(0);
		System.out.println(studentList);
		
		studentList.clear();
		System.out.println(studentList);
		
		// Loop
		for (String test : testList) {
			System.out.println("Cac phan tu trong List test: " + test);
		}
	}

}
