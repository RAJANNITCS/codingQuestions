package linkedlistPrograms;

class Node {
	public int data;
	public Node next;
	
	public Node(int data){
		this.data = data;
		this.next = null;
	}
}

public class CreateSinglyLinkedlist {
	
	public Node headNode = null;
	public Node tailNode = null;
	
	public void add(int data) {
		Node newNode = new Node(data);
		if (this.headNode == null) {
			this.headNode = newNode;
			this.tailNode = newNode;
		}else {
			this.tailNode.next = newNode;
			this.tailNode = newNode;
		}
	}
	
	public void display() {
		Node currentNode = this.headNode;
		if (currentNode == null) {
			System.out.println("list is empty");
		}else {
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}
	
	public static void main(String[] args) {
		CreateSinglyLinkedlist obj = new CreateSinglyLinkedlist();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		obj.add(10);
		obj.add(12);
		obj.add(14);
		obj.display();
	}
}
