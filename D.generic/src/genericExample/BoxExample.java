package genericExample;

class Box<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}

public class BoxExample {

	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();

		box1.set("hello");
		String str = box1.get();
		System.out.println(str);

		Box<Integer> box2 = new Box<Integer>();
		box2.set(6);
		int value = box2.get();
		System.out.println(value);
	}

}
