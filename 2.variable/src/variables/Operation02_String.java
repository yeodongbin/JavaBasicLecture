package variables;

public class Operation02_String {
	public static void main(String[] args) {
		String str = "JDK";
		str = str + 1;
		System.out.println(str);
		str = str + 2 + 3;
		System.out.println(str);
		
		str = 4 + 5 + str;
		System.out.println(str);
		
		str = 'J'+"AVA"+"JDK";
		System.out.println(str);
		
		char a1 = 'J';
		char a2 = 'A';
		char a3 = 'V';
		char a4 = 'A';
		//str = a1 + a2 + a3 + a4; (실행 X)
		int a = a1 + a2 + a3 + a4;
		str = a1 + a2 + a3 + a4 + "jdk";
		System.out.println(str);
		System.out.println(a);
		System.out.println();
		
		//====================================================
		//논리식 > < == <= >= != <>
		int b = 10, c = 20;
		boolean bool = (b<c);// True 
		System.out.println(bool);
		
		boolean b1 = (c>=b)&&(c<=b); //true AND false = false
		boolean b2 = (c<=b)||(c<b);  //false OR false = false
		boolean b3 = (c>b)^(c==b);   //true NOR false = true
		boolean b4 = !(c<b);         //NOT(false) = true
		
		boolean b5 = (c>=b)&(c<=b);  // bit 연산 and
		boolean b6 = (c>=b)|(c<b);   // bit 연산 or
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
	}
}
