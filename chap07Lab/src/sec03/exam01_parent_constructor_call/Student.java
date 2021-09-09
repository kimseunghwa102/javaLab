package sec03.exam01_parent_constructor_call;

public class Student extends People {
	public int studentNo;
	
	
	
	Student(String name, String ssn, int studentNo){
		super(name, ssn); //먼저 부모개체에서 있는 생성자를 불러오고 그다음 자기꺼
		this.studentNo = studentNo;
	}
	
}
