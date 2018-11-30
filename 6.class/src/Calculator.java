package class_object;

public class Calculator {
	int c =0;
	
	void add(int a, int b) {
		c = a+b; 
		System.out.println(a+b);
		//return a + b;
	}
	
	void minus(int a, int b) {
		System.out.println(a-b);
//		return a-b;
	}
	
	void mux (int a) {
		c = c * a;
		System.out.println(c);
	}
	
	void div (int a) {
		c = c/a;
		System.out.println(c);
	}
	
	int mod (int a, int b) {
		return a%b;
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
//		System.out.println(cal.add(5,6));
//		System.out.println(cal.minus(5,6));
//		System.out.println(cal.mux(5,6));
//		System.out.println(cal.div(5,6));
//		System.out.println(cal.mod(5,6));
		cal.add(5, 7);
		cal.mux(2);
		cal.div(3);
	}

}
