package problem;

public class BST {
	class Node {
		char data;
		Node left;
		Node right;
	}

	Node root = null;

	Node insertNode(Node root, char input) {
		Node disNode = root;
		Node newNode = new Node();
		newNode.data = input;
		newNode.left = null;
		newNode.right = null;

		if (disNode == null) {
			return newNode;
		} else if (disNode.data > newNode.data) {
			// left
			disNode.left = insertNode(disNode.left, input);
			return disNode;
		} else if (disNode.data < newNode.data) {
			// right
			disNode.right = insertNode(disNode.right, input);
			return disNode;
		} else {
			return disNode;
		}
	}

	void InsertBST(char x) {
		root = insertNode(root, x);
	}

	// 검색 구현?
	Node searchBST(char x) {
		Node disNode = root;
		while (disNode != null) {
			if (x < disNode.data) {
				disNode = disNode.left;
			} else if (x > disNode.data) {
				disNode = disNode.right;
			} else {
				return disNode;
			}
		}
		return disNode;
	}

	// 출력 구현 ? 중위탐색
	void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}

	}

	void printBST() {
		inorder(root);
		System.out.println();
	}

	public static void main(String[] args) {
		BST bst = new BST();
		bst.InsertBST('G');
		bst.InsertBST('I');
		bst.InsertBST('H');
		bst.InsertBST('D');
		bst.InsertBST('B');
		bst.InsertBST('M');
		bst.InsertBST('N');
		bst.InsertBST('A');
		bst.InsertBST('J');
		bst.InsertBST('E');
		bst.InsertBST('G');

		bst.printBST();
	}
}
