package verify.exam05;

public class ActionExample {

	public static void main(String[] args) {

		//�͸�����ü: new �������̽���(){ //�߻�޼ҵ� ����};
		Action action = new Action() {

			@Override
			public void work() {
				// TODO Auto-generated method stub
				System.out.println("�����մϴ�.");
			}
			

		};
		
		action.work();
		
	}

}
