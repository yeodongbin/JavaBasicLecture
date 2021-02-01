package problem;

public class Stack {

	int[] stack = null;
	int dataCount;
	int front;
	int rear;

	Stack() {               //       *   ^
			stack = new int[4]; // | 1 | 2 |   |   |
			dataCount = 0;
			front = 0;
			rear = 0;
		}

	void push(int num) {
		if (getDataSize() < stack.length) {
			front = rear;
			stack[rear] = num;
			rear++;
			dataCount++;
		} else {
			System.out.println("stack is full!!");
		}
	}

	int pop() {
		int temp = -1;

		if (!isEmpty()) {
			temp = stack[front];
			stack[front] = 0;
			dataCount--;
			front--;
			rear--;
			if (front < 0) {
				front = 0;
			}
			System.out.println("pop : " + temp);
		} else {
			System.out.println("stack is no data");
		}
		return temp;
	}

	int getDataSize() {
		return dataCount;
	}

	boolean isEmpty() {
		return (dataCount <= 0 ? true : false);
	}

	void print() {
		for (int val : stack) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.print();

		stack.pop();
		stack.print();

		stack.pop();
		stack.print();

		stack.pop();
		stack.print();

		stack.pop();
		stack.print();

		stack.pop();
		stack.print();
	}
}
