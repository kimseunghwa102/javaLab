package sec10.exam01_static_member;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 1);
		int result3 = Calculator.minus(30, 20);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);


	}

}
