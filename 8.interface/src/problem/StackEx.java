package problem;

public class StackEx {

	public static void main(String[] args) {
		Stack stack = new Stack() {
			
			int length = 5;
			char[] charArr = new char[5];
			// 1 2 3 4 5
			// a |
			int pointer = 0;

			@Override
			public boolean push(Object ob) {
				if (pointer < length) {
					charArr[pointer++] = (char) ob;
				} else {
					char[] temp = new char[length * 2];
					
					for (int i = 0; i<length ; i++) {
						temp[i] = charArr[i];
					}
					charArr = temp;
					charArr[pointer++] = (char) ob;
				}
				return true;
			}

			@Override
			public Object pop() {
				char result = ' ';
				if (pointer != 0) {
					result = charArr[--pointer];
					charArr[pointer] = ' ';
				} else {
					System.out.println("배열에 값이 없습니다.");
				}
				return result;
			}

			@Override
			public Object peek() {
				char result = ' ';
				if (pointer != 0) {
					result = charArr[--pointer];
					pointer++;
				} else {
					System.out.println("배열에 값이 없습니다.");
				}
				return result;
			}

			@Override
			public int length() {
				return pointer;
			}
		};
		
		stack.push('a');
		stack.push('b');
		stack.push('c');
		stack.push('d');
		stack.push('e');
		stack.push('f');
		stack.push('g');
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	
		
		System.out.println(stack.length());
	}
}

interface Stack {
	public abstract int length(); // 현재 저장되어 있는 데이터의 갯수

	public abstract Object pop(); // 추출

	public abstract boolean push(Object ob); // 삽입

	public abstract Object peek(); // 읽기
}