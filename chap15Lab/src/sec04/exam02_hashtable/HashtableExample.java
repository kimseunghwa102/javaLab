package sec04.exam02_hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new Hashtable<String, String>(); //Map�� �������̽� string�� ���׸� Hashtable�� �������̽��� �ִ� ���� Ŭ����

		map.put("String", "12");
		map.put("sumber", "123");
		map.put("fall", "1234");
		map.put("winder", "12345");

		Scanner scanner = new Scanner(System.in); //�ý��ۿ��� ���� �о �����ϴ� �ν��Ͻ�
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Ϸ��� �ּ���");
			System.out.println("���̵�:");
			String id = scanner.nextLine(); //�Է��� ������ ���ڿ��� ��ȯ�Ѵ�.
		
			System.out.println("��й�ȣ: ");
			String password = scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				}else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			}else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
				
			}
		}
	}

}
