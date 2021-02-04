package genernicInheritance;

public class StorageImpl<T> implements Storage<T> {
	private T[] array;

	public StorageImpl(int capacity) {
		System.out.println("StorageImpl()");
		this.array = (T[]) (new Object[capacity]);//»ý¼º X new T[n]
	}

	@Override
	public void add(T item, int index) {
		System.out.println("StorageImpl.add");
		array[index] = item;
	}

	@Override
	public T get(int index) {
		System.out.println("StorageImpl.get");
		return array[index];
	}
}
