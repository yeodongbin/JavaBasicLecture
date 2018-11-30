package variable_type;

public class Operation_Ex3 {

	public static void main(String[] args) {
		String str = "JDK";
		str = str + 1 + 2;
		System.out.println(str);
		
		str = "JDK";
		str =  1 + 2 + str;
		System.out.println(str);
		
		//str = 'J' + 'AVA' + " JDK";
		str = 'J' + "AVA" + " JDK";
		System.out.println(str);
		
		char a1 = 'J';
		char a2 = 'A';
		char a3 = 'V';
		char a4 = 'A';
		//str = "JDK " + a1 + a2 + a3 + a4 ;
		str = a1 + a2 + a3 + a4 + " JDK";
		System.out.println(str);
		
	}

}
