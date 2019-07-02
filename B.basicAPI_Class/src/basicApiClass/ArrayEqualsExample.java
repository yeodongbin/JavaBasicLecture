package basicApiClass;

import java.util.Arrays;

public class ArrayEqualsExample {

	public static void main(String[] args) {

		int[][] ori = {{1,2}, {3,4}};
		
		int[][] cloned1 = Arrays.copyOf(ori, ori.length);
		
		System.out.println(ori.equals(cloned1));
		System.out.println(Arrays.equals(ori,cloned1));
		System.out.println(Arrays.deepEquals(ori,cloned1));
		
		int[][] cloned2 = Arrays.copyOf(ori, ori.length);
		cloned2[0] = Arrays.copyOf(ori[0], ori[0].length);
		cloned2[1] = Arrays.copyOf(ori[1], ori[1].length);
		
		System.out.println(ori.equals(cloned2));
		System.out.println(Arrays.equals(ori,cloned2));
		System.out.println(Arrays.deepEquals(ori,cloned2));
		
		
		
		
	}

}
