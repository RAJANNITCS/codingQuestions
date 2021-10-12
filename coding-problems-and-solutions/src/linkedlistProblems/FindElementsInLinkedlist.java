package linkedlistProblems;

public class FindElementsInLinkedlist {
	
	class Node {
		public int data;
		public Node next = null;
		
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
			tailNode.next = newNode;
			tailNode = newNode;
		}
	}
	
	public int searchElements(int value) {
		Node currentNode = this.headNode;
		int countNode = 0;
		if (currentNode == null) {
			return 0;
		}
		
		while (currentNode != null) {
			countNode++;
			if (currentNode.data == value) {
				return countNode;
			}
			currentNode = currentNode.next;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		FindElementsInLinkedlist obj = new FindElementsInLinkedlist();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(8);
		obj.addNode(10);
		obj.addNode(12);
		System.out.println("find element is =" + obj.searchElements(13));
	}
}
