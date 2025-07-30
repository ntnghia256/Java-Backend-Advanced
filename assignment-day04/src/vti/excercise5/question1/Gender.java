package vti.excercise5.question1;

public enum Gender {
	MALE("Nam"),
	FEMALE("Nu"),
	UNKNOWN("Khac");
	
	private String value;
	
	Gender(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
//	public static void main(String[] args) {
//		System.out.println(Gender.MALE.getValue());
//	}
}
