package sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();

		// 按眉 历厘
		map.put("脚侩鼻", 85);
		map.put("全辨悼", 90);
		map.put("悼厘焙", 80);
		map.put("全辨悼", 95);
		System.out.println("醚 Entry 荐:" + map.size());

		// 按眉 茫扁
		System.out.println("\t全辨悼:" + map.get("全辨悼"));

		// 按眉甫 窍唱究 贸府 规过1 : keySet()
		Set<String> keySet = map.keySet();
		Iterator<String> KeyIterator = keySet.iterator();
		while(KeyIterator.hasNext());
		String Key=KeyIterator.next();
		Integer value = map.get(Key);
		System.out.println();
		System.out.println("\t"+Key+":"+value);
		
		//按眉 昏力
		map.remove("全辨悼");
		System.out.println("醚 Entty荐:"+map.size());
		
		//按眉甫 窍唱究 贸府 规过2 : entrSet()
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer Value = entry.getValue();
			System.out.println("\t"+key+":"+value);
		}
		System.out.println();
		
		//按眉 傈眉 昏力
		map.clear();
		System.out.println("醚 Entry荐"+map.size());
	}

}
