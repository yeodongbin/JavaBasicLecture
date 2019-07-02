package basicApiClass;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {
		int[] num = {2,3,6,1,5};
		
		Arrays.sort(num);
		for( int number : num) {
			System.out.print(number + " ");
		}
		int index = Arrays.binarySearch(num, 6);
		System.out.println();
		System.out.println(index);//4
		
	
		String[] names = {"È«±æµ¿", "¹Úµ¿¼ö" , "±è¹Î¼ö"};
		Arrays.sort(names);
		for (String name : names) {
			System.out.print(name + " ");
		}
		System.out.println();
		index = Arrays.binarySearch(names, "È«±æµ¿");
		System.out.println(index);//2
		
		Member3 name1 = new Member3(1,"È«±æµ¿");
		Member3 name2 = new Member3(2,"¹Úµ¿¼ö");
		Member3 name3 = new Member3(3,"±è¹Î¼ö");
		Member3[] memberName = {name1, name2, name3};
		Arrays.sort(memberName);
		
		for (Member3 mem : memberName) {
			System.out.println(mem.no + " " + mem.name);
		}
		
		index = Arrays.binarySearch(memberName, name3);
		System.out.println(index);//1
	}
}

class Member3 implements Comparable<Member3> {
	Integer no;
	String name;
	Member3(Integer no,String name) {
		this.no = no;
		this.name = name;
	}
	
	@Override
	public int compareTo(Member3 o) {
		return this.no.compareTo(o.no);
	}
}

