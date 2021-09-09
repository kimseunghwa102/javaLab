package sec08.exam01_abstract_class;

public class PhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cna't instantiate the type Phone
		//Phone phoe = new Phone("me");
		
		SmartPhone smartPhone = new SmartPhone("Elon");
		
		smartPhone.turnOn();
		smartPhone.internetSerach();
		smartPhone.turnOff();
	}

}
