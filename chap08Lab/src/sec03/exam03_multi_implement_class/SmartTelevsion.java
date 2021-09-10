package sec03.exam03_multi_implement_class;

//다중 인터페이스 구현 클래스
public class SmartTelevsion implements RemoteControl, Searchable{

	
	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url+"을 검색합니다.");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void sestVolume(int volume) {
		// TODO Auto-generated method stub
	System.out.println("보륨");	
	}

}
