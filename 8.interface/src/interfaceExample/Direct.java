package interfaceExample;

class A {
	void autoPlay(Direct_interface i) {
		i.play();
	}

	// Overload
	void autoPlay(B b) {
		b.play();
	}

	void autoPlay(C c) {
		c.play();
	}
}

class B implements Direct_interface {
	public void play() {
		System.out.println("play in B class");
	}
}

class C implements Direct_interface {
	public void play() {
		System.out.println("play in C class");
	}
}

public class Direct {

	public static void main(String[] args) {
		A a = new A();
		a.autoPlay(new B());
		a.autoPlay(new C());
	}

}
