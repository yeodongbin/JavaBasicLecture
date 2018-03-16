package nestedClass;

public class A {
	A() {
		System.out.println("A construction");
	}

	class B {
		B() {
			System.out.println("B construction");
		}

		int field1;
		// static int field1;

		void method1() {
		}
		// static void method1() {}
	}

	static class C {
		C() {
			System.out.println("C construction");
		}

		int field1;
		static int field2;

		void method1() {
		}

		static void method2() {
		}
	}

	void method() {
		class D {
			D() {
				System.out.println("D construction");
			}

			int field1;
			// static int field1;

			void method1() {
			}
			// static void method1() {}
		}

		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
