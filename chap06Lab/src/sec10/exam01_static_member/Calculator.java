package sec10.exam01_static_member;

import sec09.exam01_instance_member.Car;

public class Calculator {
	static double pi = 3.14159; //static을 붙이면 정적필드가 된다.
								//정적필드 : 객체를 만들지 않고 class 이름만 가지고 사용가능
								//객체 = ex) Car myCar = new Car 
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}
