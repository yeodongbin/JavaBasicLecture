package interface_object.stackQueue;

public class StackExample {

	public static void main(String[] args) {
//		CharStack cs = new CharStack();
//		cs.push('A');
//		cs.push('B');
//		cs.push('C');
//		System.out.println(cs.length());
//		System.out.println(cs.pop());
//		System.out.println(cs.pop());
//		System.out.println(cs.pop());
		
		Stack stack = new Stack() { //익명 구현 객체
			char[] arr = new char[5]; // 0 1 2 3 4
			int pointer = 0;

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
				int temp = pointer;
				char result = arr[--temp];
				return result;
			}

			@Override
			public int length() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		stack.peek();
	}

}
