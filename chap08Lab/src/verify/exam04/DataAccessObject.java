package verify.exam04;

//DAO(Data Access Object) : java class <-> db)Oracle DB, MySQL)
public interface DataAccessObject {
	//�������̽��� �������
	//���
	//�߻�޼ҵ�
	//Ƽ��Ʈ�޼ҵ�
	//�����޼ҵ�
	
	

	abstract void select(); //�߻�޼ҵ� abstract��������.

	void insert();
	
	void update();
	
	void delete();
	

	
}
