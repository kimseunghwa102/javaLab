package sec03.exam01_name_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// rc:변수
		RemoteControl rc;
		rc = new Television(); //인터페이스 변수 rc에 = 구현객체를 넣었다.
		rc = new Audio(); // 인터페이스 변수 = 오디오 구현객체;
		//인터페이스의 목적은 다양성이다. 다양성=인터페이스
	}

}
