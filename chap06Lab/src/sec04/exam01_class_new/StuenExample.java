package sec04.exam01_class_new;

//실행용 클래스 
public class StuenExample {

	public static void main(String[] args) {
		//Student객체를 만들어 생성된 객체의 주소값을 s1변수에 저장한다.
		//s1는 Studnet객체를 참조하니깐 s1는 생성된 student객체를 지칭한다.
		Studnet s1 = new Studnet(); 
		System.out.println("s1변수가 Studnet객체를 참조합니다.");

		Studnet s2 = new Studnet();
		System.out.println("s2 변수가 또 다른 Studnet객체를 참조합니다.");
		
	}

}
