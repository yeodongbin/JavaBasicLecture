package arrayExample;

public class AdvancedForExample {

	public static void main(String[] args) {
		
//		for (�ӽ� ����:[�迭]) {
//			
//		}
		
		int[] score = {95,71,84,93,87};
		
		int sum =0;
		for (int s :score) {
			sum = sum + s;
		}
		
		System.out.println(sum);

	}

}
