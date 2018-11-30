package variable_type;

public class Operation_Ex4 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		// > < >= <= == !=
		boolean b1 = (a>=b)&&(a<=b); // 
		boolean b2 = (a<=b)||(a<=b); //  
		boolean b3 = (a>b)^(a==b);	 //  
		boolean b4 = !(a<b);	    // 
		boolean b5 = (a==b)|(a==b); // 
		boolean b6 = (a!=b)&(a==b); // 
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
	}
}
