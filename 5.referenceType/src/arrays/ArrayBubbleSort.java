package referenceType;

public class ArrayBubbleSort {
	static int[] array = new int[] { 10, 5, 9, 1, 8 };
	
	public static void main(String[] args) {
		
		int temp = 0;

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 1; j < array.length; j++) {
				if (array[j - 1] > array[j]) {
					swap(j-1, j);
				}
			}
		}

		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}
	}
	
	public static void swap(int a, int b) {
		int temp;
		temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
//	public static void main(String[] args) {
//		int[] array = new int[] { 10, 5, 9, 1, 8 };
//		int temp = 0;
//
//		for (int i = 0; i < array.length - 1; i++) {
//			for (int j = 1; j < array.length; j++) {
//				if (array[j - 1] > array[j]) {
//					swap(j-1, j, array);
//				}
//			}
//		}
//
//		for (int j = 0; j < array.length; j++) {
//			System.out.println(array[j]);
//		}
//	}
//	
//	public static void swap(int a, int b, int[] arr) {
//		int temp;
//		temp = arr[a];
//		arr[a] = arr[b];
//		arr[b] = temp;
//	}

}
