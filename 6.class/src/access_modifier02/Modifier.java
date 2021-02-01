package access_modifier02;


public class Modifier {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.getA());
		a.setA(20);
		System.out.println(a.getA());
	}
}

class A {
	private int a = 10;     // field
	
	A() {};         // Constructor
	
	void printa() { // Method
		System.out.println(a);
	}
	
	//Getter
	int getA() {
		return this.a;
	}
	
	//Setter
	void setA(int _a) {
		this.a = _a;
	}
}
