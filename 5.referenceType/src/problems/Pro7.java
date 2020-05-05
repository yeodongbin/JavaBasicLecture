package problems;

public class Pro7 {
	public static void main(String[] args) {
		int max =0;
		int[] array = {1,5,3,8,2};
		
		int temp1 = array[0];
		
		for (int i=1; i<array.length;i++) {
			if (array[i] > temp1) {
				temp1 = array[i];
			}
		}
		
		max = temp1;
		

		for (int temp2 : array) {
			if(temp2 > max ) {
				max = temp2;
			}
		}
		
		System.out.println("max: "+ max);
	}
}
