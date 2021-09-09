package sec02.exam01_inheritance;

public class CellPhone {
	//클래스 구성멤버
	//필드
	String model;
	String color;
	
	//생성자
	
	//메소드
	void powrOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	void sendVoice(String message) {
		System.out.println("자기:"+message);
	}
	void receiveVoive(String message) {
		System.out.println("상대방:"+message);
	}
	void hangUp() {
		System.out.println("전하를 끊습니다.");
	}
	
}
