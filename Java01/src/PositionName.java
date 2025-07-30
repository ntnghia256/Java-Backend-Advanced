
public enum PositionName {
	DEV("Dev"),
	TEST("Test"),
	SCRUM_MASTER("Scrum master"),
	PM("PM");
	
	private String value;

	PositionName(String value) {
		this.value = value;
	}
	
	// Function get value by ENUM
	public String getValue() {
		return value;
	}
	
	// Function get ENUM by value
	public static PositionName fromValue(String value) {
		for (PositionName positionName : PositionName.values()) {
			if (positionName.getValue().equals(value)) {
				return positionName;
			}
		}
		throw new IllegalArgumentException("Can't not find PositionName with value: " + value);
	}
}
