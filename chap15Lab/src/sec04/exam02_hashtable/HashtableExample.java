package sec04.exam02_hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new Hashtable<String, String>(); //Map은 인터페이스 string은 제네릭 Hashtable은 인터페이스에 있는 구현 클래스

		map.put("String", "12");
		map.put("sumber", "123");
		map.put("fall", "1234");
		map.put("winder", "12345");

		Scanner scanner = new Scanner(System.in); //시스템에서 값을 읽어서 저장하는 인스턴스
		
		while(true) {
			System.out.println("아이디와 비밀번호를 일력해 주세요");
			System.out.println("아이디:");
			String id = scanner.nextLine(); //입력한 한줄을 문자열로 반환한다.
		
			System.out.println("비밀번호: ");
			String password = scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("로그인 되었습니다.");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
				
			}
		}
	}

}
