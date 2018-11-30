package arrayExample;

public class ArrayPibo {

	public static void main(String[] args) {
		int[] pibo = new int[10]; 
		
		pibo[0] = 0;
		pibo[1] = 1;
		
		for (int i=0; i<(pibo.length - 2);i++) {
			pibo[i+2] = pibo[i] + pibo[i+1];
		
		}
		
		for (int i=0; i<pibo.length;i++) {
			System.out.print(pibo[i]+ " ");
		}
	}
}
