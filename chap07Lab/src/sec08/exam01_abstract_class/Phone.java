package sec08.exam01_abstract_class;

public abstract class Phone {
	//추상 클래스의 구성 맴버
	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	//일반 메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다");
	}
	//추상 메소드
	
}
