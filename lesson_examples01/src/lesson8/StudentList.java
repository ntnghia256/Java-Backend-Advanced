package lesson8;

import java.util.Arrays;
import java.util.List;

public class StudentList {
	private int id;
	private String name;
	private int age;

	public StudentList(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "StudentList [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentList st1 = new StudentList(1, "NVA", 10);
		StudentList st2 = new StudentList(2, "NVB", 11);
		StudentList st3 = new StudentList(3, "NVC", 12);
		StudentList st4 = new StudentList(4, "NVD", 13);
		StudentList st5 = new StudentList(5, "NVE", 14);

		List<StudentList> listStudent = Arrays.asList(st1, st2, st3, st4, st5);

		for (StudentList st : listStudent) {
			System.out.println(st.toString());
		}
	}

}
