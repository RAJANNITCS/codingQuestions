package linkedlistCodingQuestions;

public class DeleteNodeFromCircularLinkedlist {
	public Node headNode;
	public Node tailNode;
	
	public int deleteNodeFromCircularLinkedlist(int poss) {
		int deletedValue = 0;
		Node tailNo = null;
		Node currentNode = headNode;
		if (poss == 1) {
			deletedValue = currentNode.data;
			do {
				currentNode = currentNode.next;
			}while (currentNode.next != headNode);
			
			currentNode.next = headNode.next;
			headNode = headNode.next;
		}else {
			for (int i = 1; i < poss; i++) {
				tailNo = currentNode;
				currentNode = currentNode.next;
			}
			deletedValue = currentNode.data;
			tailNo.next = currentNode.next;
			currentNode.next = null;
		}
		return deletedValue;
	}
	
	public void add(int data) {
		Node newNode = new Node(data);
		if (headNode == null) {
			headNode = newNode;
			tailNode = newNode;
			tailNode.next = headNode;
		}else {
			tailNode.next = newNode;
			tailNode = newNode;
			tailNode.next = headNode;
		}
	}
	
	public void display() {
		Node currentNode = headNode;
		do {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}while (currentNode.next != headNode.next);
	}
	
	public static void main(String[] args) {
		DeleteNodeFromCircularLinkedlist obj = new DeleteNodeFromCircularLinkedlist();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		obj.add(10);
		obj.add(12);
		obj.display();
		System.out.println("Delete value is "+obj.deleteNodeFromCircularLinkedlist(3));
		System.out.println("after delete");
		obj.display();
	}
}	
