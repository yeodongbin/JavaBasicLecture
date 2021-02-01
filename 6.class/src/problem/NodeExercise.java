package problem;

public class NodeExercise {

	public static void main(String[] args) {
		// Linked List
		Node node1 = new Node();
		node1.num = 1;

		Node node2 = new Node();
		node2.num = 2;

		Node node3 = new Node();
		node3.num = 3;

		Linkedlist ll = new Linkedlist();
		ll.append(node1);
		ll.append(node2);
		ll.append(node3);

		ll.printList();

		Node nodenew = new Node();
		nodenew.num = 4;
		ll.insert(1, nodenew);

		ll.printList();
	}
}

class Node {
	int num = 0;
	Node front = null;
	Node back = null;
}

class Linkedlist {
	Node head;// first Node address
	Node tail;// last Node address
	int size = 0; // Total Node count

	void append(Node node) {
		if (head == null) {
			head = node;
			tail = node;
			size++;
		} else {
			tail.back = node;
			node.front = tail;
			tail = node;
			size++;
		}
	}

	void insert(int index, Node node) {
		if (size == 0 && index == 0) {
			head = node;
			tail = node;
			size++;
		} else if (size > 0 && index < size && index >= 0) {
			if (index == 0) {// first
				head.front = node;
				node.back = head;
				size++;
				head = node;
			} else if (index == (size - 1)) { // last
				tail.back = node;
				node.front = tail;
				size++;
				tail = node;
			} else { // middle
				Node pointer;
				pointer = head;
				for (int i = 0; i < index; i++) {
					pointer = pointer.back;
				}
				node.front = pointer.front;
				node.back = pointer;
				pointer.front.back = node;
				pointer.front = node;
				size++;
			}
		} else {
			System.out.println("insert를 진행할 수 없습니다.");
		}
	}

	void printList() {
		Node pointer;

		if (head != null) {
			pointer = head;
			for (int i = 0; i < size; i++) {
				System.out.print(pointer.num + ", ");
				pointer = pointer.back;
			}
			System.out.println();
		} else {
			System.out.println("list에 데이터가 없습니다.");
		}
	}

//	void remove(int index)
//	Node read(int index)
//	void update(int index, int number)
}