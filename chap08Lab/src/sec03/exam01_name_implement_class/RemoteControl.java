package sec03.exam01_name_implement_class;

public interface RemoteControl {
 
	//�������̽��� �������
	//���
    int MAX_VOLUME = 10; //	public static final�� �����ڿ� �ڵ� ������.
	int MIN_VOLUME = 10;
	
	
	//�߻�޼ҵ�  //��ɾ��� �����⸸
	abstract void turnOn();
	void turnOff();
	void sestVolume(int volume); 
	
	
	//����Ʈ�޼ҵ� //����� �� �ִ�.
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}
	//�����޼ҵ�
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
