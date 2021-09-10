package verify.exam04;

//DAO(Data Access Object) : java class <-> db)Oracle DB, MySQL)
public interface DataAccessObject {
	//인터페이스의 구성멤버
	//상수
	//추상메소드
	//티폴트메소드
	//정적메소드
	
	

	abstract void select(); //추상메소드 abstract빠져도됨.

	void insert();
	
	void update();
	
	void delete();
	

	
}
