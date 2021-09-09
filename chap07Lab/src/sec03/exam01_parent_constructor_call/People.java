package sec03.exam01_parent_constructor_call;

public class People {  //필드
	public String name;
	public String ssn;
	
	//public People() {}
	
	public People(String name, String ssn) { //생성자
		this.name = name;
		this.ssn = ssn;
	}
}
