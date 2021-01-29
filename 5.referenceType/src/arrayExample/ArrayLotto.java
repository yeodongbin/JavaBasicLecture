package arrayExample;

public class ArrayLotto {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		// _ _ _ _ _ _
		
		for (int i = 0; i<lotto.length ; i++) {
			lotto[i] = (int)(Math.random()*45)+1;//1~45
			for (int j = 0; j<i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		//================================================
		
		int[] number = new int[45];
		for (int i = 0;i<number.length ;i++) {
			number[i] = i+1; // 1 2 3 4 5 6 ... 45
		}
		
		int[] lotto2 = new int[6];
		
		for (int i = 0; i<6 ; i++) {
			int numi = (int)(Math.random()*45);//0~44
			if (number[numi] != 0) {
				lotto2[i] = number[numi];
				number[numi] = 0;
			} else {
				i--;
			}
		}
		
		for (int i = 0;i<lotto.length;i++) {
			System.out.print(lotto[i]+ " ");
		}
		System.out.println();
		for (int i = 0;i<lotto2.length;i++) {
			System.out.print(lotto2[i]+ " ");
		}
		
		
	}

}
