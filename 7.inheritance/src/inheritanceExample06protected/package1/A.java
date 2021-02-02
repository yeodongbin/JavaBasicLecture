package inheritanceExample06protected.package1;

public class A {
	protected String fieldA = "A";
	protected A() {}
	void methodA() {System.out.println("methodA");}
}

class B {
	void methodB() {
		A a = new A();
		a.fieldA = "a";
		a.methodA();
	}
	
}
