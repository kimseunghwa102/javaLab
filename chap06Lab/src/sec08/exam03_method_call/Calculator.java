package sec08.exam03_method_call;

public class Calculator {
	//필드
	//생성자
	//메소드 //여기에 메소드는 4개이다.
	int plus(int x, int y) {
		int result = x + y;
		return result;     //void 문이 아니기때문에 리턴값을 입력해야함.
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum /2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);
		println("실행결과:"+result);
	}
	void println(String message) {  //void는 리턴값이 없을때 사용한다.
		System.out.println(message);
	}
}
