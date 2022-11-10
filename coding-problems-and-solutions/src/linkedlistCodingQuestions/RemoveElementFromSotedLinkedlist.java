package linkedlistCodingQuestions;

public class RemoveElementFromSotedLinkedlist {
	public Node headNode = null;
	public Node tailNode = null;
	
	public void add(int data) {
		Node newNode = new Node(data);
		if (headNode == null) {
			headNode = newNode;
			tailNode = newNode;
		}else {
			this.tailNode.next = newNode;
			tailNode = newNode;
		}
	}
	
	public void display() {
		Node currentNode = headNode;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
	
	public void removeDuplicateNode() {
		Node tailNode = headNode;
		Node currentNode = headNode.next;
		while (currentNode != null) {
			if (tailNode.data != currentNode.data) {
				tailNode = currentNode;
				currentNode = currentNode.next;
			}else {
				tailNode.next = currentNode.next;
				currentNode.next = null;
				currentNode = tailNode.next;
			}
		}
		
	}
	
	public static void main(String[] args) {
		RemoveElementFromSotedLinkedlist obj = new RemoveElementFromSotedLinkedlist();
		obj.add(2);
		obj.add(2);
		obj.add(4);
		obj.add(5);
		obj.add(5);
		obj.add(5);
		obj.add(8);
		obj.display();
		System.out.println("after remove elements");
		obj.removeDuplicateNode();
		obj.display();
	}
}
