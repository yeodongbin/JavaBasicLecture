package linkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		Linkedlist list = new Linkedlist();
		
		list.firstNode(10);
		list.addRearNode(20);
		list.printData();
//		System.out.println(list.size);
		list.removeNode(2);
		list.printData();
		list.removeAllNode();
		list.printData();		
	}

}
