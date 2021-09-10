package sec05.exam03_casting;

//Bus 구현 클래스
public class Bus implements Vehicle {

	@Override //재정의  or 구현한다.
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}
