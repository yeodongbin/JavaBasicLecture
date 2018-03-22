package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("JAVA");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");

		int size = set.size(); // 갯수
		System.out.println("Size = " + size);

		Iterator<String> iterator = set.iterator(); // 반복자 리턴

		while (iterator.hasNext()) {// 값을 가지고 있으면...
			String element = iterator.next();
			System.out.println(element);
		}

		set.clear(); // 완전 삭제
		size = set.size();
		System.out.println("Size = " + size);

		if (set.isEmpty()) {
			System.out.println("비어있음");
		}
	}
}
