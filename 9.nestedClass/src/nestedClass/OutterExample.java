package nestedClass;

public class OutterExample {

	public static void main(String[] args) {
		Outter outter = new Outter();
		Outter.NestedClass nested = outter.new NestedClass();
		System.out.println(outter.outter);
	    outter.method();
		
		System.out.println(nested.nested);
		nested.method();
	}

}
