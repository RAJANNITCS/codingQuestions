package linkedlistProblems;

public class ConcatenatTwoLinkedlist {

	class Node {
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public Node headNode = null;
	public Node tailNode = null;

	public void addNode(int data) {
		Node newNode = new Node(data);
		if (this.headNode == null) {
			this.headNode = newNode;
			this.tailNode = newNode;
		} else {
			tailNode.next = newNode;
			tailNode = newNode;
		}
	}

	public void display() {
		Node currentNode = this.headNode;
		if (currentNode == null) {
			System.out.println("List is empty");
		} else {
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}

	public static void concatinateList(ConcatenatTwoLinkedlist obj1, ConcatenatTwoLinkedlist obj2) {
		{
			Node currentNode = obj1.headNode;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = obj2.headNode;
		}

	}
	
	public static void main(String[] args) {
		ConcatenatTwoLinkedlist obj1 = new ConcatenatTwoLinkedlist();
		ConcatenatTwoLinkedlist obj2 = new ConcatenatTwoLinkedlist();
		obj1.addNode(2);
		obj1.addNode(4);
		obj1.addNode(6);
		obj1.addNode(8);
		obj1.addNode(10);
		obj2.addNode(3);
		obj2.addNode(6);
		obj2.addNode(9);
		obj2.addNode(12);
		obj2.addNode(15);
		obj2.addNode(18);
		concatinateList(obj1, obj2);
		obj1.display();
	}
}
