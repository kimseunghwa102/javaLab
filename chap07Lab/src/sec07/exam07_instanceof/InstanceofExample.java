package sec07.exam07_instanceof;

public class InstanceofExample {

	public static void method1(Parnet parnet) {
		if(parnet instanceof Child) {
			Child child = (Child) parnet;
		System.out.println("method1-Child로 변환 성공");
		}else {
			System.out.println("method1-Child로 변환되지 않음");
		}
	}
	
	public static void method2(Parnet parnet) {
		Child child = (Child) parnet;
		System.out.println("method2-Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parnet parnetA = new Child();//자동형 변환
		method1(parnetA);
		method2(parnetA);
		
		Parnet parnetB = new Parnet();
		method1(parnetB);
		method2(parnetB); //예외 발생 부모타입에서 자식으로 형변환 불가
	}

}
