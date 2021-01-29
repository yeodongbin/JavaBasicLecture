package arrayExample;

public class ArrayExample05Copy {

	public static void main(String[] args) {
		int[] oldIntArr = { 1, 2, 3 };
		int[] newIntArr = new int[5];

		for (int i = 0; i < oldIntArr.length; i++) {
			newIntArr[i] = oldIntArr[i];
		}

		String[] oldstrArr = { "java", "array", "copy" };
		String[] newstrArr = new String[5];

//		System.arraycopy(oldstrArr, 1, 
//				         newstrArr, 2, 2);
		myArrCopy(oldstrArr, 1, newstrArr, 2, 2);

		for (int i = 0; i < newstrArr.length; i++) {
			System.out.println(newstrArr[i] + ", ");

		}
	}

	public static void myArrCopy(String[] arr1, int s1, String[] arr2, int s2, int size) {
		while (size != 0) {
			arr2[s2++] = arr1[s1++];
			size--;
		}
	}

	public static void myArrCopy2(int[] origin, int oidx, int[] copy, int cidx, int size) {

		boolean ok = (origin.length - oidx <= size) && 
				 (copy.length - cidx >= size) && 
				 (size > 0) && 
				 (oidx >= 0) && (oidx < origin.length) && 
				 (cidx >= 0) && (cidx < copy.length);
		if (ok) {
			while (size != 0) {
				copy[cidx++] = origin[oidx++];
				size--;
			}
		} else {
			System.out.println("다시 입력!");
			return;
		}

		printArray(copy);
	}

	private static void printArray(int[] copy) {
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
	}

}
