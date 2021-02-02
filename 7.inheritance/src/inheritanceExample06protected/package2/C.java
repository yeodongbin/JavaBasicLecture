package inheritanceExample06protected.package2;
import inheritanceExample06protected.package1.A;

public class C {	
	void methodC() {
		A a = new A();
		a.fieldA = "a";
		a.methodA();
	}
}


class D extends A {
	D() {
		super();
	}
	
	void methodD() {
		this.methodA();
		this.fieldA = "D";
	}
	
}
