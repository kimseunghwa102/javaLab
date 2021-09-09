package sec11.exam01_final;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("12345-12533", "일론");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation="usa"; //The final field person.nation cantt be assing 
		
		p1.name="을지문덕";
		System.out.println(p1.name);
	}

}
