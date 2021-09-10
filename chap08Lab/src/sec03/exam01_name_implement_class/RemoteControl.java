package sec03.exam01_name_implement_class;

public interface RemoteControl {
 
	//인터페이스의 구성멤버
	//상수
    int MAX_VOLUME = 10; //	public static final이 생성자에 자동 생성됨.
	int MIN_VOLUME = 10;
	
	
	//추상메소드  //기능없이 껍데기만
	abstract void turnOn();
	void turnOff();
	void sestVolume(int volume); 
	
	
	//디폴트메소드 //기능이 들어가 있다.
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	//정적메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
