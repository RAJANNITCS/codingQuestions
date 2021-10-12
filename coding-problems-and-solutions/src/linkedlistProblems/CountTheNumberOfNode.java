package linkedlistProblems;

public class CountTheNumberOfNode {
	
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
	public int numberOfNode = 0;
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		
		if(this.headNode == null) {
			this.headNode = newNode;
			this.tailNode = newNode;
		}else {
			tailNode.next = newNode;
			tailNode = newNode;
		}
	}
	
	public void displayList() {
		Node currentNode = this.headNode;
		if (currentNode == null) {
			System.out.println("List is empty");
			return;
		}
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
	
	public int countNodeV1() {
		int numberOfNode = 0;
		Node currentNode = this.headNode;
		while (currentNode != null) {
			numberOfNode++;
			currentNode = currentNode.next;
		}
		return numberOfNode;
	}
	 
	public int countNodeV2(Node current) {
		if (current != null) {
			this.numberOfNode++;
			countNodeV2(current.next);
		}
		return numberOfNode;
	}
	
	public int countNodeV3(Node current) {
		if (current == null) {
			return 0;
		}else {
			return countNodeV3(current.next) + 1;
		}
	}
	
	
	public static void main(String[] args) {
		CountTheNumberOfNode obj = new CountTheNumberOfNode();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(8);
		obj.addNode(10);
		obj.displayList();
//		System.out.println("number of node in list="+ obj.countNodeV1());
//		System.out.println("number of node in list="+ obj.countNodeV2(obj.headNode));
		System.out.println("number of node in list="+ obj.countNodeV3(obj.headNode));
	}
}
