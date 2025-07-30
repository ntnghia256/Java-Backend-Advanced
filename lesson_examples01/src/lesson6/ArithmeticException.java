package lesson6;

public class ArithmeticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float rs = divide(7, 0);
		
		System.out.println(rs);
	}
	
	public static float divide(int a, int b) {
		return a / b;
	}

}
