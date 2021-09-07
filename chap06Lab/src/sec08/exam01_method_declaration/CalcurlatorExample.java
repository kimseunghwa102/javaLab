package sec08.exam01_method_declaration;

public class CalcurlatorExample {

	public static void main(String[] args) {

		Calculator myCalculator = new Calculator();
		myCalculator.powerOn();
		
		int result1 = myCalculator.plus(5, 6);
		System.out.println("result1:"+result1);
		
		byte x = 10;
		byte y = 4;
		double result2=myCalculator.divide(x, y);
		//자동형 변화:int <-byte
		//강제혀 변환 : byte(1) <- int(4), 
		//예)int num=10,
		// byte b1= (byte)num;
		System.out.println("result2:"+result2);
		
		myCalculator.powerOff();
	}///main

}//////class
