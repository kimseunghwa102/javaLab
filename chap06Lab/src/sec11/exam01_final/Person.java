package sec11.exam01_final;

public class Person {
	final String nation = "Korean"; ///final은 한번 정해지면 값을 변경못함.
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn=ssn;
		this.name=name;
	}
}
