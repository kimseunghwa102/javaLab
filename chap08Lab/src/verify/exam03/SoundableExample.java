package verify.exam03;

public class SoundableExample {
	//�޼ҵ�
	private static void printSound(Soundable soundable) {
		//�޼ҵ�
		System.out.println(soundable.sound());
		}
		public static void main(String[] args) {
		printSound(new Cat());
		//Soundable soundable = new Cat();; //�������̽� ���� = ������ü; �ڵ�����ȯ
		printSound(new Dog());  //Cat�� �ְ� Dog�� �ְ� �������̽�=�پ缺
		}
}
