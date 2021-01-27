package arrayExample;

public class ArrayBubbleSort {

	public static void main(String[] args) {
		int[] arr = {10,5,9,1,8};
		

		for (int i = 0; i<arr.length-1; i++) {
			for (int j = 1; j<arr.length; j++) {
				if (arr[j-1] < arr[j]) {
					swap(arr, j);
				}
			}
		}
		print(arr);
	}
	public static void swap(int[] arr, int j) {
		int temp = 0;
		temp = arr[j-1];
		arr[j-1] = arr[j];
		arr[j]= temp;
	}
	
	public static void print(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
