package sec03.exam03_multi_implement_class;

public class RemotoControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTelevsion tv = new SmartTelevsion();
	
		RemoteControl re = tv; //�������̽� ���� = ������ü;
		Searchable searchable = tv; //�������̽� ���� = ������ü;
	}

}
