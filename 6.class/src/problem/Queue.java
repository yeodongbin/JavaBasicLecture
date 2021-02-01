package problem;

public class Queue {

	int[] queue = null;
	int dataCount;
	int front;
	int rear;

	Queue() {               //   ^        *            
		queue = new int[4]; // |    |   | 3 | 4 |
		dataCount = 0;
		front = 0;
		rear = 0;
	}

	void push(int num) {
		if (getDataSize() < queue.length) {
			queue[rear] = num;
			rear++;
			rear %= queue.length;
			dataCount++;
		} else {
			System.out.println("stack is full!!");
		}
	}

	int pop() {
		int temp = -1;
		
		if (!isEmpty()) {
			temp = queue[front];
			queue[front] = 0;
			front++;
			front %= queue.length;
			dataCount--;
			System.out.println("pop : " + temp);
		} else {
			System.out.println("queue is no data");
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
		for (int val : queue) {
			System.out.print(val + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Queue q = new Queue();
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		q.print();
		
		q.pop();
		q.print();
		
		q.pop();
		q.print();
		
		q.pop();
		q.print();
		
		q.pop();
		q.print();
		
		q.pop();
		q.print();
		

	}

}
