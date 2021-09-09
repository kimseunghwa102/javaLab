package sec05.exam02_final_method;

public class SportsCar extends Car {
	
	@Override
	public void speedUp() {
		speed+=10;
	}
	//- Cannot override the final method from Car
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	} //파이널이라 변환불가 오벌로딩불가
}
