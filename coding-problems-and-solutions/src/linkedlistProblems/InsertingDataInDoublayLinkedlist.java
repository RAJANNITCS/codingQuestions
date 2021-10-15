package linkedlistProblems;

public class InsertingDataInDoublayLinkedlist {

	class Node {
		public Node pre;
		public int data;
		public Node next;
		
		public Node(int data) {
			this.pre  = null;
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
	
	public void displayDoublayLinkedlist() {
		Node currentNode = this.headNode;
		if (currentNode == null) {
			System.out.println("List is empty");
		}else {
			System.out.println("List is ");
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}
	
	public void insertDoublyLinkedlist(int poss, int data) {
		Node currentNode = this.headNode;
		Node newNode = new Node(data);
		if (poss == 1) {
			this.headNode.pre = newNode;
			newNode.next = this.headNode;
			this.headNode = newNode;
		}else {
			for (int i = 1; i < poss - 1; i++) {
				currentNode = currentNode.next;
			}
			
			newNode.next = currentNode.next;
			newNode.pre = currentNode;
			if (currentNode.next != null) {
				currentNode.next.pre = newNode;
			}
			currentNode.next = newNode;
		}
	}
	
	public static void main(String[] args) {
		InsertingDataInDoublayLinkedlist obj = new InsertingDataInDoublayLinkedlist();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(8);
		obj.addNode(10);
		obj.addNode(12);
		obj.displayDoublayLinkedlist();
		obj.insertDoublyLinkedlist(5, 22);
		obj.displayDoublayLinkedlist();
	}
}
