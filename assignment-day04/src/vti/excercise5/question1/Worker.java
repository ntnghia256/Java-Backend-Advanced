package vti.excercise5.question1;

public class Worker extends Staff {
	private int rank;

	public Worker(String name, int age, Gender gender, String address, int rank) {
		super(name, age, gender, address);
		// TODO Auto-generated constructor stub
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Worker " + super.toString() + ", rank=" + rank + "";
	}

}
