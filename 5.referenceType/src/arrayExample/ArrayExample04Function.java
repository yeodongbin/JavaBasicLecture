package arrayExample;

public class ArrayExample04Function {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] { 83, 90, 87 };

		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		System.out.println(sum1);
		
		System.out.println(scores.length);

		int sum2 = add(new int[] { 83, 90, 87 });
		System.out.println(sum2);

		return;
	}

	public static int add(int[] scores) {
		int sum=0;
		for (int i=0; i<3;i++) {
			sum += scores[i];
		}
	return sum;
	}
}
