package sec09.exam01_instance_member;

public class CarExample {

	public static void main(String[] args) {
	
		Car myCar = new Car("벤츠");
		Car yourCar = new Car("이항");
		
		myCar.model="테슬라";//인스턴스 필드
		myCar.run(); //인스턴스 메소드
		yourCar.run();//인스턴스 메소드
		//yourCar.setSpeed(20);
	}

}
