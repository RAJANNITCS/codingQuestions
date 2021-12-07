package linkedlistPrograms;

public class MergingtwoLinkedList {
	
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
		}else {
			this.tailNode.next = newNode;
			this.tailNode = newNode;
		}
	}
	
	public static void display(Node currentNode) {
		if (currentNode == null) {
			System.out.println("List is empty");
		}else {
			System.out.println("List elements are");
			while (currentNode != null ) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}
	
	public static Node mergerTwoList(Node first, Node second) {
		Node third = null;
		Node last = null;
		if (first.data < second.data) {
			third = first;
			last = first;
			first = first.next;
		}else {
			third = second;
			last = second;
			second = second.next;
		}
		
		while (first != null && second != null) {
			if (first.data < second.data) {
				last.next = first;
				last = first;
				first = first.next;
				last.next = null;
			}else {
				last.next = second;
				last = second;
				second = second.next;
				last.next = null;
			}
		}
		
		if (first != null) {
			last.next = first;
		}
		if (second != null) {
			last.next = second;
		}
		return third;
	}
	
	public static void main(String[] args) {
		MergingtwoLinkedList obj1 = new MergingtwoLinkedList();
		MergingtwoLinkedList obj2 = new MergingtwoLinkedList();
 		obj1.addNode(2);
		obj1.addNode(4);
		obj1.addNode(6);
		obj1.addNode(8);
		obj1.addNode(10);
		obj1.addNode(12);
		obj1.addNode(14);
		display(obj1.headNode);
		obj2.addNode(3);
		obj2.addNode(5);
		obj2.addNode(9);
		obj2.addNode(13);
		obj2.addNode(15);
		display(obj2.headNode);
		Node third = mergerTwoList(obj1.headNode, obj2.headNode);
		display(third);
	}
}
