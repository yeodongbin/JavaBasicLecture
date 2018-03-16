package refereance_pro;

public class Pro7 {
	public static void main(String[] args) {
		int max =0;
		int[] array = {1,5,3,8,2};
		
		int temp = array[0];
		
		for (int i=1; i<array.length;i++) {
			if (array[i] > temp) {
				temp = array[i];
			}
		}
		
		max = temp;
		
		System.out.println("max: "+ max);
	}
}
