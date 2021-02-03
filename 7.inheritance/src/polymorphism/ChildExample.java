package polymorphism;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();

		parent.method1();
		parent.method2();
		// parent.method3();

		if (parent instanceof Child) {
			System.out.println("parent = Child()");
			int a = (int) 10.2;

			Child child = (Child) parent;

			child.method1();
			child.method2();
			child.method3();
		}

	}
}
