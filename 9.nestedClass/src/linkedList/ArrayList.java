package linkedList;

public class ArrayList {
	static final int ARRAY_UNIT = 4;
	int[] array;
	int size;

	ArrayList() {
		array = new int[ARRAY_UNIT];
		size = 0;
	}

	void printArray() {
		for (int data : array) {
			System.out.print(data + " ");
		}
	}
	
	private void expendArray() {
		int[] tempArray = new int[array.length + ARRAY_UNIT];
		System.arraycopy(array, 0, tempArray, 0, array.length);
		this.array = tempArray;
	}

	void add(int data) {
		if (size < array.length) {
			array[size] = data;
			size++;
		} else if (size == array.length) {
			expendArray();
			array[size - 1] = data;
			size++;
		} else {
			System.out.println("Array 크기 오류!!");
		}

	}

	void delete(int index) {

		if ((index <= (size - 1)) && (index >= 0)) { // 정상
			if (index == (size - 1)) {
				array[index] = 0;
			} else {
				for (int i = index; i < (array.length - 1); i++) {
					array[i] = array[i + 1];
				}
				array[array.length-1] = 0;
			}
			size--;
		} else {
			System.out.println("array 값의 크기를 확인하시오");
		}
	}

}
