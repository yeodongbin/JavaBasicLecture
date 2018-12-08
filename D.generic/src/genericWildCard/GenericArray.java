package genericWildCard;

public class GenericArray <T> {
	private T[] array;
	
	GenericArray(int capa) {
		//array = new T()[3];
		array = (T[]) (new Object[capa]);
	}
	
	public void input(T t, int index) {
		if (index < array.length) {	
			array[index] = t;
		}
		
		for (T ary : array) {
			
		}
	}
	
}
