package problems;

public class Permutation {

	public static void main(String[] args) {
		int count = 0;
		int num = 5;

		for (int i = 1; i < (num + 1); i++) {
			for (int j = 1; j < (num + 1); j++) {
				for (int k = 1; k < (num + 1); k++) {
					if ((i != j) && (j != k) && (i != k)) {
						count++;
						System.out.println(i + " " + j + " " + k);
					}
				}
			}
		}

		System.out.println("5P3=" + count);
	}

}
