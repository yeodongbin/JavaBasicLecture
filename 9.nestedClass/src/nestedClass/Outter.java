package nestedClass;

public class Outter {
	String outter = "Outter field";

	void method() {
		System.out.println("Outter method");
	}

	// 중첩class - 인스턴스 멤버 클래스
	class NestedClass {
		String nested = "nested field";

		void method() {
			System.out.println("Nested method");
		}
	}
}
