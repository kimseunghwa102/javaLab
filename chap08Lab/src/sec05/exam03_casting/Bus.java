package sec05.exam03_casting;

//Bus ���� Ŭ����
public class Bus implements Vehicle {

	@Override //������  or �����Ѵ�.
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}
	
	public void checkFare() {
		System.out.println("��������� üũ�մϴ�.");
	}
}
