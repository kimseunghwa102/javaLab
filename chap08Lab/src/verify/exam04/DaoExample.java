package verify.exam04;

public class DaoExample {
	
	///class�� ����
	//�ʵ�
	//������
	
	
	//�޼ҵ�
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
		}
		public static void main(String[] args) {
		//DataAccessObject dao = new OracleDao(); �ڵ��ຯȯ
		dbWork(new OracleDao()); //������ü
		dbWork(new MySqlDao()); //
		}
}
