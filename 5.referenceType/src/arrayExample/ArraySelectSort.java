package arrayExample;

public class ArraySelectSort {
	int i, j, least, temp;
	int[] list = new int[] { 2, 5, 6, 1 };
	int arrLenght = list.length;

	// ������ ���ڴ� �ڵ����� ���ĵǱ� ������ (���� ����-1) ��ŭ �ݺ��Ѵ�.
	for(i=0;i<arrLenght-1;i++)
	{
		least = i;

		// �ּڰ��� Ž���Ѵ�.
		for (j = i + 1; j < arrLenght; j++) {
			if (list[j] < list[least])
				
				least = j;
		}

		// �ּڰ��� �ڱ� �ڽ��̸� �ڷ� �̵��� ���� �ʴ´�.
		if (i != least) {
			// swap(list[i], list[least]);
		}
	}
}
