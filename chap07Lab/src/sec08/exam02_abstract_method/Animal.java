package sec08.exam02_abstract_method;
//abstract �߻�޼ҵ� (){} ���°��ƴ� ()�� 
public abstract class Animal {
	//�߻�Ŭ������ �������
	//�ʵ�
	public String kind;
	
	//������
	//�Ϲݸ޼ҵ�
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
	//�߻�޼ҵ�
	public abstract void sound(); //abstract �߻�޼ҵ�
//�߻�޼ҵ�� 	@Override�� �ڽİ�ü�� �ڵ����� �������.
}
