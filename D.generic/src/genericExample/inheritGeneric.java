package genericExample;

class ChildProduct<T, M, C> extends Product<T, M> {
	private C company;

	public C getCompany() {
		return this.company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
}

interface Storage<T> {
	public void add(T item, int index);

	public T get(int index);
}

class StorageImpl<T> implements Storage<T> {
	private T[] array;

	public StorageImpl(int capacity) {
		this.array = (T[]) (new Object[capacity]);
	}

	@Override
	public void add(T item, int index) {
		array[index] = item;
	}

	@Override
	public T get(int index) {
		return array[index];
	}
}

public class inheritGeneric {

	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product = new ChildProduct<>();

		product.setKind(new Tv());
		product.setModel("Smart TV");
		product.setCompany("LG");

		Storage<Tv> storage = new StorageImpl<Tv>(100);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
	}

}
