package map.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		// Map �÷��� ����
		Map<String, Integer> map = new HashMap<String, Integer>();

		// ��ü ����
		map.put("MINHO", 85);
		map.put("JIHEA", 90);
		map.put("YOUNGHE", 75);
		map.put("DONGBIN", 65);
		System.out.println("�� Entry ��: " + map.size());

		// ��ü ã��
		System.out.println("\tȫ�浿 : " + map.get("DONGBIN"));
		System.out.println();

		// ��ü�� �ϳ��� ó��
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		// 
		map.remove("DONGBIN");
		System.out.println("�� Entry ��: " + map.size());

		// 
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		// 
		map.clear();
		System.out.println("�� Entry ��: " + map.size());
	}
}
