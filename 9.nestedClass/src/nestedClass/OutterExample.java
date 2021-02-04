package nestedClass;

public class OutterExample {

	public static void main(String[] args) {
		Outter out = new Outter();
		out.method();

		// Instance member class
		Outter.NestedClass inner = out.new NestedClass();
		// X Outter.NestedClass inner2 = new Outter.NestedClass();
		inner.innerMethod();
		System.out.println(out.outter);
		System.out.println(inner.inner);
		
		
		//static member class
		Outter.statNestedClass statInner = new Outter.statNestedClass();
		statInner.statInnerMethod();
		System.out.println(statInner.statInner);
		
	}

}
