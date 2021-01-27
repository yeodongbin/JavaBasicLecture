package arrayExample;

public class ArrayCopyExample {

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
		myArrCopy(oldstrArr, 1, 
		          newstrArr, 2, 2);

		for (int i = 0; i < newstrArr.length; i++) {
			System.out.println(newstrArr[i] + ", ");

		}
	}

	public static void myArrCopy(String[] arr1,int s1,
			                     String[] arr2,int s2,
			                     int size) {
		while (size != 0) {
			arr2[s2++] = arr1[s1++];
			size--;
		}
	}


}
