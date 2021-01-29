package arrayExample;

public class ArrayExample03SelectSort {

	public static void main(String[] args) {
		int[] arr = { 10, 5, 9, 1, 8 };

		for (int i = 0; i < arr.length; i++) {
			int min_index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min_index] > arr[j]) {
					min_index = j;
				}
			}
			// swap
			int temp = 0;
			temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}

		for (int value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
}
