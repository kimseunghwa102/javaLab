package verify.exam04;

public class DaoExample {
	
	///class의 구성
	//필드
	//생성자
	
	
	//메소드
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
		}
		public static void main(String[] args) {
		//DataAccessObject dao = new OracleDao(); 자동행변환
		dbWork(new OracleDao()); //구현객체
		dbWork(new MySqlDao()); //
		}
}
