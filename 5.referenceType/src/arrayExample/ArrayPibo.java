package arrayExample;

public class ArrayPibo {

	public static void main(String[] args) {

		int[] arr = new int[10];
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 2; i<arr.length ;i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		for (int i = 0; i<arr.length ;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//Advanced For
		for (int temp : arr) {
			System.out.print(temp+" ");
		}
		
		
		
	}

}
