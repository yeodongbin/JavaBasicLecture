package nestedClass;

public class Outter {
	String outter = "Outter field";

	void method() {
		System.out.println("Outter method");
	}

	// ��øclass - �ν��Ͻ� ��� Ŭ����
	class NestedClass {
		String nested = "nested field";

		void method() {
			System.out.println("Nested method");
		}
	}
}
