package generic_basic;

public class GenericExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("Hello World");
		System.out.println(box.method());
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(12345);
		System.out.println(box2.method());
	}
}

class Box<T> {
	private T i;
	public T method() {
		return i;
	}
	public void set(T i) {
		this.i = i;
	}
}


interface IBox<T> {
	public void set(T i);
}


abstract class AbsBox<T> {
	public abstract void set(T i);
}
