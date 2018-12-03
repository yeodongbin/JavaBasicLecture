package nestedClass.advance;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B(); //인스턴스
		b.fieldB = 100;
		b.methodB();
		
		A.C c = new A.C(); //정적
		c.fieldC = 100;
		c.methodC();
		
		a.method(10, 20); //class D 생성
		
		
	}

}