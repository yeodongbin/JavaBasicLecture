package nestedClass.advance;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B(); //�ν��Ͻ�
		b.fieldB = 100;
		b.methodB();
		
		A.C c = new A.C(); //����
		c.fieldC = 100;
		c.methodC();
		
		a.method(10, 20); //class D ����
		
		
	}

}