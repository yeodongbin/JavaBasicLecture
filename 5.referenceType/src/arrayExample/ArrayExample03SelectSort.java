package arrayExample;

public class ArrayExample03SelectSort {

	public static void main(String[] args) {
		int i, j, least, temp;
		int[] list = new int[] { 2, 5, 6, 1 };
		int arrLenght = list.length;


		for (i = 0; i < arrLenght - 1; i++) {
			least = i;
			for (j = i + 1; j < arrLenght; j++) {
				if (list[j] < list[least])

					least = j;
			}

			if (i != least) {
				// swap(list[i], list[least]);
			}
		}
	}
}
