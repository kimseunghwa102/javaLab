package sec03.exam02_nonname_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//익명구현객체: 인터페이스 변수 = new 인터페이스 (){//추상메소드 재정의}
		RemoteControl re = new RemoteControl() {

		//익명구현객체
			@Override
			public void turnOn() {
				System.out.println("전원을 켭니다");
				// TODO Auto-generated method stub
				
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void sestVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
			
			//람다식: 익명구현객체를 간략히 표현하는 식.
//			re = () -> {System.out.println("전원 켭니다.");};
			
			};
	}

}
