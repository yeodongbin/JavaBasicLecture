package problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Pro9 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;

		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		int[] ary = new int[set.size()];
		int i = 0;
		while (iter.hasNext()) {
			String n = iter.next();
			ary[i] = map.get(n);
			if (ary[i] > maxScore) {
				name = n;
				maxScore = ary[i];
			}
			totalScore += ary[i];
			i++;
		}

//		Arrays.sort(ary);
//		for (int a : ary) {
//			System.out.println(a);
//		}
//		maxScore = ary[ary.length - 1];
		
//		Set<Map.Entry<String, Integer>> entries = map.entrySet();
//		for (Map.Entry<String, Integer> entry : entries) {
//			if (maxScore< entry.getValue()) {
//				maxScore = entry.getValue();
//				name = entry.getKey();
//			}
//			totalScore += entry.getValue();
//		}
		
		

		System.out.println("Avg : " + (totalScore / ary.length));
		System.out.println("Max : " + maxScore);
		System.out.println("ID(max) : " + name);
	}
}
