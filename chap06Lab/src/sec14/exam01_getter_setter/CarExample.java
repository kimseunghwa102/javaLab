package sec14.exam01_getter_setter;

public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		myCar.speed2 = -5; //잘못된 데이터를 방지하기위해 셋터 게터를 
		//사용한다. 여기에 숫자를 넣어도 필드에는 값이 초기지정값 0이된다.
		//myCar.speed = -5;
		myCar.setSpeed(-5);
		
		System.out.println("현재속도:"+myCar.getSpeed());
		System.out.println("speed2:"+myCar.speed2);
	}

}
