package arrayExample;

public class ArraySelectSort {
	int i, j, least, temp;
	int[] list = new int[] { 2, 5, 6, 1 };
	int arrLenght = list.length;

	// 마지막 숫자는 자동으로 정렬되기 때문에 (숫자 개수-1) 만큼 반복한다.
	for(i=0;i<arrLenght-1;i++)
	{
		least = i;

		// 최솟값을 탐색한다.
		for (j = i + 1; j < arrLenght; j++) {
			if (list[j] < list[least])
				
				least = j;
		}

		// 최솟값이 자기 자신이면 자료 이동을 하지 않는다.
		if (i != least) {
			// swap(list[i], list[least]);
		}
	}
}
