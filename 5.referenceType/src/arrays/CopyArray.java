package arrays;
public class CopyArray {

	public static void main(String[] args) {
		int[] arr = {87, 90, 83};
		int[] arr2 = new int[5];
		
		for (int i=0; i<2 ; i++) {
			arr2[i] = arr[i+2];	
			}
		
		System.arraycopy(arr, 0, arr2, 2, 2);
		

	}

}
