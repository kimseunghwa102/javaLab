package sec04.exam01_overriding;
//자식객체 부모객체의 것을 그대로 가져와 내용을 수정한다.
// 오버라이딩(Overriding)
//상속자는 부모 메소드의 시그너처(리턴 타입, 메소드명, 매개 변수)와 동일해야 한다
public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	 	}
}
