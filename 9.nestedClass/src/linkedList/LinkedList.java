package linkedList;

public class LinkedList {
	class Node {
		int data;
		Node front, back;

		Node(int data) {
			this.data = data;
		}
	}

	Node head, tail;
	int size = 0;

	void addHeadNode(int data) {
		Node newNode = new Node(data);
		if (size == 0) {
			head = newNode;
			tail = newNode;
			size++;
			System.out.println("Add first Node!! : " + newNode.data);
		} else {
			head.front = newNode;
			newNode.back = head;
			head = newNode;
			size++;
			System.out.println("Add Head Node : " + newNode.data);
		}

	}

	void addRearNode(int data) {
		Node newNode = new Node(data);
		if (size == 0) {
			head = newNode;
			tail = newNode;
			size++;
			System.out.println("Add first Node!! : " + newNode.data);
		} else {
			tail.back = newNode;
			newNode.front = tail;
			tail = newNode;
			size++;
			System.out.println("Add Tail Node : " + newNode.data);
		}
	}

	int readData(int index) {
		int result = -1;
		if (size > 0 && index < size) {
			Node ptrNode = head;
			for (int i = 0; i < index; i++) {
				ptrNode = ptrNode.back;
			}
			result = ptrNode.data;
		} else {
			System.out.println("data가 없습니다.!!");
		}
		return result;
	}

	void printData() {
		if (size > 0) {
			Node ptrNode = head;
			for (int i=0; i<size;i++) {
				System.out.print(ptrNode.data + ", ");
				ptrNode = ptrNode.back;
			}
			System.out.println();
		} else {
			System.out.println("data가 없습니다.!!");
		}
	}

	boolean removeNode(int index) {
		if (size > 0 && index < size && index >= 0) {
			if (index == 0) {//first
				head = head.back;
				head.front = null;
				size--;
			} else if(index == (size-1)) {//last
				tail = tail.front;
				tail.back = null;
				size--;
			} else {//middle
				Node ptrNode = head;
				for (int i=0;i<index;i++) {
					ptrNode = ptrNode.back;
				}
				ptrNode.front.back = ptrNode.back;
				ptrNode.back.front = ptrNode.front;
				size--;
			}
			return true;
		} else {
			System.out.println("삭제할 수 없습니다.");
			return false;
		}
	}
	
	boolean removeAllData() {
		head = null;
		tail = null;
		size = 0;
		return true;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addHeadNode(10);
		list.addHeadNode(20);
		list.addHeadNode(30);
		list.printData();
		
		list.addRearNode(40);
		list.printData();
		
		list.removeNode(1);
		list.printData();
		
		list.removeAllData();
		list.printData();
		
		
	}

}

