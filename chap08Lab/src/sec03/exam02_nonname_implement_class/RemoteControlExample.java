package sec03.exam02_nonname_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�͸�����ü: �������̽� ���� = new �������̽� (){//�߻�޼ҵ� ������}
		RemoteControl re = new RemoteControl() {

		//�͸�����ü
			@Override
			public void turnOn() {
				System.out.println("������ �մϴ�");
				// TODO Auto-generated method stub
				
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void sestVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
			
			//���ٽ�: �͸�����ü�� ������ ǥ���ϴ� ��.
//			re = () -> {System.out.println("���� �մϴ�.");};
			
			};
	}

}
