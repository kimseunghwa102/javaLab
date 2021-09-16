package sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();

		// ��ü ����
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95);
		System.out.println("�� Entry ��:" + map.size());

		// ��ü ã��
		System.out.println("\tȫ�浿:" + map.get("ȫ�浿"));

		// ��ü�� �ϳ��� ó�� ���1 : keySet()
		Set<String> keySet = map.keySet();
		Iterator<String> KeyIterator = keySet.iterator();
		while(KeyIterator.hasNext());
		String Key=KeyIterator.next();
		Integer value = map.get(Key);
		System.out.println();
		System.out.println("\t"+Key+":"+value);
		
		//��ü ����
		map.remove("ȫ�浿");
		System.out.println("�� Entty��:"+map.size());
		
		//��ü�� �ϳ��� ó�� ���2 : entrSet()
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer Value = entry.getValue();
			System.out.println("\t"+key+":"+value);
		}
		System.out.println();
		
		//��ü ��ü ����
		map.clear();
		System.out.println("�� Entry��"+map.size());
	}

}
