package generic_array;

public class GenericArray<T> {
	private T[] array;

	GenericArray(int capa) {
		// array = new T()[3];
		array = (T[]) (new Object[capa]);
	}

	public void input(T t, int index) {
		if (index < array.length) {
			array[index] = t;
		}

		for (T ary : array) {
			System.out.print(ary + " ");
		}
	}
	
	public static void main(String[] args) {
		GenericArray<Integer> ga = new GenericArray<>(3);
		ga.input(0, 0);
		ga.input(1, 1);
		ga.input(2, 2);
		
		
		
	}

}
