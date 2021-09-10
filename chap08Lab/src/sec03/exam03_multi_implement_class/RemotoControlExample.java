package sec03.exam03_multi_implement_class;

public class RemotoControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTelevsion tv = new SmartTelevsion();
	
		RemoteControl re = tv; //인터페이스 변수 = 구현객체;
		Searchable searchable = tv; //인터페이스 변수 = 구현객체;
	}

}
