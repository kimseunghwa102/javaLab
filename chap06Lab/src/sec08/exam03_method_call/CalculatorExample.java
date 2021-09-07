package sec08.exam03_method_call;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		
	
		System.out.println(myCalc.plus(1, 3));
		System.out.println(myCalc.avg(4, 4));
		
		myCalc.execute();
		myCalc.println("hello");
	}/////main

}/////////class
