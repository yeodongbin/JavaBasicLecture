package problem;

public class NumberOfCases {

	public static void main(String[] args) {
		//1 2 3 4 5
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
		System.out.println("��ü ����� �� : " + count);
		System.out.println("��ü ������ �� : " + countP);
		System.out.println("��ü ������ �� : " + countC);
		
		
	}
}
