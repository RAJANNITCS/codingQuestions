package linkedlistProblems;

public class AlternatingSplitOfGivenLinkedlist {
	
	class Node {
		public int data;
		public Node next;
		
		public Node (int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node headNode = null;
	public Node tailNode = null;
	public Node headNode2 = null;
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if (this.headNode == null) {
			this.headNode = newNode;
			this.tailNode = newNode;
		}else {
			this.tailNode.next = newNode;
			this.tailNode= newNode;
		}
	}
	
	public static void display(Node headNode) {
		if (headNode == null) {
			System.out.println("List is empty");
		}else {
			System.out.println("list is ");
			while (headNode != null) {
				System.out.println(headNode.data);
				headNode = headNode.next;
			}
		}
	}
	
	public static void splitLinkedlist(AlternatingSplitOfGivenLinkedlist obj) {
		Node tempNode = null;
		Node tailNode = obj.headNode;
		Node frontNode = obj.headNode.next;
		int i = 0;
		
		while ( frontNode != null) {
			if (i % 2 != 0) {
				tailNode.next = frontNode;
				tailNode = frontNode;
				frontNode = frontNode.next;
				i++;
			}else {
				if (obj.headNode2 == null) {
					obj.headNode2 = frontNode;
					tempNode = frontNode;
					frontNode = frontNode.next;
					tempNode.next = null;
					i++;
				}else {
					tempNode.next = frontNode;
					tempNode = frontNode;
					frontNode = frontNode.next;
					tempNode.next = null;
					i++;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		AlternatingSplitOfGivenLinkedlist obj = new AlternatingSplitOfGivenLinkedlist();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(8);
		obj.addNode(10);
		obj.addNode(12);
		obj.addNode(14);
		obj.addNode(16);
		obj.addNode(18);
		obj.addNode(20);
		splitLinkedlist(obj);
		display(obj.headNode);
		display(obj.headNode2);
	}
}
