package verify.exam03;

public class SoundableExample {
	//메소드
	private static void printSound(Soundable soundable) {
		//메소드
		System.out.println(soundable.sound());
		}
		public static void main(String[] args) {
		printSound(new Cat());
		//Soundable soundable = new Cat();; //인터페이스 변수 = 구현객체; 자동형변환
		printSound(new Dog());  //Cat도 넣고 Dog도 넣고 인터페이스=다양성
		}
}
