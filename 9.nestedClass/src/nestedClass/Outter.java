package nestedClass;

public class Outter {
	String outter = "outter field";

	void method() {
		System.out.println("outter method");
		
		class methodClass {
			String methodClass = "method Class";
			
			void methodClass() {
				System.out.println("method Class()");
			}
		}
		
		// 3.Local Class
		methodClass mc = new methodClass();
		mc.methodClass();
		System.out.println(mc.methodClass);
	}

	class NestedClass {
		String inner = "innter field";

		void innerMethod() {
			System.out.println("innter method");
		}
	}
	
	static class statNestedClass {
		String statInner = "stat innter field";

		void statInnerMethod() {
			System.out.println("stat innter method");
		}
	}
}
