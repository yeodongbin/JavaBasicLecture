package variables;

public class Variable01 {
	public static void main(String[] args) {
		//byte 1 *int4 long8 float4 *double8 *char1 *String *boolean1
		
		//4byte 정수
		int a = 10;    //10
		int a8 = 010;  // 8
		int a16 = 0xA; //10
		
		System.out.println(a);
		System.out.println(a8);
		System.out.println(a16);
		
		//8byte 정수
		long b = 10;
		long b8 = 010;
		long b16 = 0xA;
		System.out.println(b);
		System.out.println(b8);
		System.out.println(b16);
		
		//2byte 정수
		short c = 32767;
		System.out.println(c);
		
		//1byte 정수
		byte d = 127; //-128 ~ 127
		System.out.println(d);
		
		//float 4byte
		float e = 0.12f;
		
		//double 8byte
		double f = 0.12;
		System.out.println(f);
		
		//char 1byte
		char g = 'a';
		System.out.println(g);
		
		//boolean 1byte
		boolean bool1 = true; //false
		System.out.println(bool1);
		
		
		//String ???
		String h = "yeodongbin";
		System.out.println(h);
		
	}
}
