package linkedlistProblems;

public class FindKthNodeFromEnd {
	
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
	
	public void addData(int data) {
		Node newNode = new Node(data);
		if (this.headNode == null) {
			this.headNode = newNode;
			this.tailNode = newNode;
		}else {
			this.tailNode.next = newNode; 
			this.tailNode = newNode;
		}
	}
	
	public void findKthNodeV1(int kthValue) {
		Node currentNode = this.headNode;
		int i = 0;  
		for (; currentNode != null; i++) {
			currentNode = currentNode.next;
		}
		i = i - kthValue;
		currentNode = this.headNode;
		for (int j = 1; j <= i; j++) {
			currentNode = currentNode.next;
		}
		System.out.println("kthNode is "+ currentNode.data);
	}
	
	public static void main(String[] args) {
		FindKthNodeFromEnd obj = new FindKthNodeFromEnd();
		obj.addData(2);
		obj.addData(4);
		obj.addData(6);
		obj.addData(8);
		obj.addData(10);
		obj.addData(12);
		obj.addData(14);
		obj.findKthNodeV1(2);
	}
}
