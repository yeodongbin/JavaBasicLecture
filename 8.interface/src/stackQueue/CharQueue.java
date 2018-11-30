package interface_object.stackQueue;

public class CharQueue implements Queue {
	int length = 5;
	char[] arr = new char[length];
	int pointer = 0;
	int re = 0;

	@Override
	public int size() {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (((arr[i] >= 65) && (arr[i] <= 90)) || ((arr[i] >= 97) && (arr[i] <= 122))) {
				cnt++;
			}
		}
		System.out.println("����:" + cnt);
		return cnt;
	}

	@Override
	public Object top() {
		char result = arr[re];
		System.out.println("������ ��:" + result);
		return result;
	}

	@Override
	public Object pop() {
		char result = arr[re];
		arr[re] = ' ';
		re++;
		System.out.println(result + "�� �������ϴ�.");
		return result;
	}

	@Override
	public boolean push(Object ob) {
		if (pointer < length) {
			arr[pointer++] = (char) ob;
			System.out.println("�Է�:" + ob);
		} else {
			char[] temp = new char[length * 2];

			for (int i = 0; i < length; i++) {
				temp[i] = arr[i];
			}
			//System.arraycopy(arr, 0, temp, 0, arr.length);
			
			arr = temp;

			arr[pointer++] = (char) ob;
			System.out.println("�迭Ȯ���� �Է�:" + ob);

		}
		return true;
	}

	@Override
	public boolean empty() {
		if (pointer == length) {
			System.out.println("�� ���ֽ��ϴ�.");
		} else {
			int r = length - pointer;
			System.out.println("���� ĭ��:" + r);
		}

		return true;
	}

}
