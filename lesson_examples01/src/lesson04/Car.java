package lesson04;

public abstract class Car extends Vehicle {
	public Car() {
		wheelAmount = 4;
	}
	
	public abstract void getEnergy();
	
	@Override
	public void go() {
		System.out.println("Go by 4 wheels");
	}
}
