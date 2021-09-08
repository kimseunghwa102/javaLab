package sec10.exam04_singleton;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Singleton obj1 = new Singleton();
		//Singleton을 브라이빗으로 막아놔서 볼 수 없음.
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
		}
	}

}
