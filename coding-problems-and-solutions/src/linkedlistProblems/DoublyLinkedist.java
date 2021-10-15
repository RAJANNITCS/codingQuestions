package linkedlistProblems;

public class DoublyLinkedist {

	class Node {
		public Node pre;
		public int data;
		public Node next;
		
		public Node(int data){
			this.pre = null;
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
			newNode.pre = tailNode;
			tailNode.next = newNode;
			tailNode = newNode;
		}
	}
	
	public void dispayDoublayLinkedlist() {
		Node currentNode = this.headNode;
		if (currentNode == null) {
			System.out.println("List is empty");
		}else {
			System.out.println("list is");
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}
	
	public static void main(String[] args) {
		DoublyLinkedist obj = new DoublyLinkedist();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(8);
		obj.addNode(10);
		obj.addNode(12);
		obj.dispayDoublayLinkedlist();
	}
}
