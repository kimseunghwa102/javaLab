package sec08.exam02_abstract_method;
//abstract 추상메소드 (){} 형태가아님 ()임 
public abstract class Animal {
	//추상클래스의 구성멤버
	//필드
	public String kind;
	
	//생성자
	//일반메소드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	//추상메소드
	public abstract void sound(); //abstract 추상메소드
//추상메소드는 	@Override이 자식객체에 자동으로 만들어짐.
}
