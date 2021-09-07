package sec08.exam01_method_declaration;

public class Calculator {
	//구성 멤버
	//1.필드
	//2.생성자 //생성자는 대문자로 시작
	//3.메소드 //메소드는 전부  소문자로 시작
	void powerOn() { //void는 리턴이 없다는 말
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y) {
		int result= x+y;
		return result; //void는 리턴이 없기에 리턴을 주입해주자.
	}
	
	double divide(int x, int y) {
		double result= (double)x/(double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
