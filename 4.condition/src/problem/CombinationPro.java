package problem;

public class CombinationPro {

	public static void main(String[] args) {

		int num = 5;

		int count = 0;
		int countP = 0;
		int countC = 0;
		
		for (int i = 1; i<6; i++) {
			for (int j = 1; j<6; j++) {
				for (int k = 1; k<6; k++) {
					System.out.println("("+i+", "+j+", "+k+")");
					count++;
					
					if ((i!=j)&&(j!=k)&&(i!=k) ) {
						countP++;
					}
					
					if ((i<j)&&(j<k)&&(i<k) ) {
						countC++;
					}
				}
			}
		}
		System.out.println("전체 경우의 수 : " + count);
		System.out.println("전체 순열의 수 : " + countP);
		System.out.println("전체 조합의 수 : " + countC);


	}// main
}
