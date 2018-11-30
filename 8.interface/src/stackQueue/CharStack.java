package interface_object.stackQueue;

public class CharStack implements Stack {

	char[] arr = new char[5]; // 0 1 2 3 4
	int pointer = 0;

	@Override
	public int length() {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] >= 65)&&(arr[i] <= 86)) {
				cnt++;
			}
		}
		return cnt;
	}

	@Override
	public Object pop() {
		char result = arr[--pointer];
		arr[pointer] = ' ';
		return result;
	}

	@Override
	public boolean push(Object ob) {
		arr[pointer++] = (char) ob;
		return true;
	}

	@Override
	public Object peek() {
		return null;
	}

}
