package linkedList;

public class LinkedList {

	Node head;
	Node rear;
	int size = 0;

	
	void firstNode(int data) {
		Node newNode = new Node(data);
		head = newNode;
		rear = newNode;
		size++;
		System.out.println("firstNode(int data) ����");
	}

	void addRearNode(int data) {
		if (size != 0) {
			Node newNode = new Node(data);
			rear.back = newNode;
			newNode.front = rear;
			rear = newNode;
			size++;
			System.out.println("addRearNode(int data) ����");
		} else {
			System.out.println("firstNode(int data) ��������ּ���");
		}
	}

	// �մܿ� Node �߰�
	void addHeadNode(int data) {
		if (size != 0) {
			Node newNode = new Node(data);
			head.front = newNode;
			newNode.back = head;
			head = newNode;
			size++;
			System.out.println("�Ǿտ� " + data + " ��");
		} else {
			firstNode(data);
		}
	}

	// Ư�� ��ġ(index) Node Data �б�
	int readData(int index) {
		int result = 0;
		try {
			Node node = head;
			for (int i = 0; i < index - 1; i++) {
				node = node.back;
			}
			result = node.data;
		} catch (Exception e) {
			System.out.println("readData(int index) Exception �߻�");
		}
		return result;
	}

	// ��ü ����� data ��� ex) 10 20 30 40 50
	void printData() {
		if (size > 0) {
			try {
				Node node = head;
				for (int i = 0; i < size; i++) {
					System.out.print(node.data + " ");
					node = node.back;
				}
			} catch (Exception e) {
				System.out.println("printData() Exception �߻�");
			}
		} else {
			System.out.println("��µ����Ͱ� �����ϴ�.");
		}
	}

	// Ư�� ��ġ(index) Node ����
	boolean removeNode(int index) {
		if ((index <= size && index > 0) && size > 0) {
			if (index == 1) {// head�� ���ﶧ
				head = head.back;
				head.front = null;
			} else if (index == size) {// rear�� ���ﶧ
				rear = rear.front;
				rear.back = null;
			} else {
				Node node = head;
				for (int i = 1; i < index; i++) {
					node = node.back;
				}
				node.front.back = node.back;
				node.back.front = node.front;
			}
			size--;
			return true;
		} else {
			System.out.println("index ����X");
			return false;
		}
	}

	// ��ü Node ����
	boolean removeAllNode() {
		head = null;
		rear = null;
		size = 0;
		return true;
	}

	class Node {
		Node(int data) {
			this.data = data;
		}

		int data;
		Node front = null;
		Node back = null;
	}
}
