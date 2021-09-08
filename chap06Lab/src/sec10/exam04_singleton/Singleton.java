package sec10.exam04_singleton;//싱글톤:서버 과부화 막기위해 사용

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton(){}
	
	//정적 메소드는 공유가 가능함 ex}class.Singleton
	static Singleton getInstance() {
		return singleton;  //private에 접근 가능한 메소드
	}
}
