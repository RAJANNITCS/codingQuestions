package linkedlistProblems;

public class DeleteNodeFromDoublayLinkedlist {

	class Node {
		public Node pre;
		public int data;
		public Node next;
		
		public Node(int data) {
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
	
	public void displayDoublyLinkedlist() {
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
	
	public void deleteNodeFromDoublyLinkedlist(int poss) {
		Node currentNode = this.headNode;
		if (poss == 1) {
			this.headNode = this.headNode.next;
			this.headNode.pre = null;
			currentNode.next = null;
		}else {
			for (int i = 1; i < poss; i++) {
				currentNode = currentNode.next;
			}
			currentNode.pre.next = currentNode.next;
			currentNode.next.pre = currentNode.pre;
			currentNode.next = null;
			currentNode.pre = null;
		}
	}
	
	public static void main(String[] args) {
		DeleteNodeFromDoublayLinkedlist obj = new DeleteNodeFromDoublayLinkedlist();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(8);
		obj.addNode(10);
		obj.addNode(12);
		obj.displayDoublyLinkedlist();
		obj.deleteNodeFromDoublyLinkedlist(2);
		obj.displayDoublyLinkedlist();
		
	}

}
