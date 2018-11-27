package nestedClass.advance;

public class Main { // 파일과 동일

	public static void main(String[] args) {
		A a = new A();

		// Instance Member Class
		A.B b = a.new B();
		b.field1 =3 ;
		b.method1();

		// Static Member Class
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 =3;
		A.C.method2();
		
		// Local Class
		a.method();
	}

}
