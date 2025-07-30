package vti.excercise5.question1;

public class Engineer extends Staff {
	private String specialized;

	public Engineer(String name, int age, Gender gender, String address, String specialized) {
		super(name, age, gender, address);
		// TODO Auto-generated constructor stub
		this.specialized = specialized;
	}

	public String toString() {
		return super.toString() + "Position: Engineer [specialized = ]" + specialized + "]";
	}
}
