package basicApiClass;

import java.util.*;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String str = "This/is/a/Test";
		StringTokenizer st = new StringTokenizer(str," ");
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		String[] test = str.split("/");
		for (String t : test) {
			System.out.println(t);
		}
		
	}

}
