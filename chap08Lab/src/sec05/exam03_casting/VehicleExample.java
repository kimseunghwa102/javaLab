package sec05.exam03_casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); //Bus��� ������ü // �ڵ�����ȯ
		
		vehicle.run();
		//vehicle.chekFare(); //Bus���� �ִ� �޼ҵ��ε� ���Ŭ���� �����Ƿ� ���������� ��ҵ�
		//�� ���� ������ ��ҷ� ���Ұ�
		
		Bus bus = (Bus)vehicle;//��������ȯ
		bus.run();
		bus.checkFare();//���������� Ȯ��� üũ��� ��밡��
	}

}
