package arrayPrograms;

public class LinearSearchOnLinkedlist {
	
	class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node headNode = null;
	public Node tailNode = null;
	
	public void addNode(int value) {
		Node newNode = new Node(value);
		if (this.headNode == null) {
			this.headNode = newNode;
			this.tailNode = newNode;
		}else {
			tailNode.next = newNode;
			tailNode = newNode;
		}
	}
	
	public void display() {
		Node currentNode = this.headNode;
		if (currentNode == null) {
			System.out.println("List is empty");
		}else {
			System.out.println("List elements are");
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}
	
	public int linearSearch(int value) {
		int count = 0;
		int tempValue = -1;
		Node currentNode = this.headNode;
		while (currentNode != null) {
			count++;
			if (currentNode.data == value) {
				tempValue = count;
				break;
			}
			currentNode = currentNode.next;
		}
		return tempValue;
	}
	
	public static void main(String[] args) {
		LinearSearchOnLinkedlist obj = new LinearSearchOnLinkedlist();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(8);
		obj.addNode(10);
		obj.addNode(12);
		obj.addNode(14);
		obj.display();
		if (obj.linearSearch(10) != -1) {
			System.out.println("position is "+ obj.linearSearch(10));
		}else {
			System.out.println("value is not found in list");
		}
	}
}
