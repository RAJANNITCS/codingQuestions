package arrayCodingQuestion;

class Node {
	public int data;
	public Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinearSearchForLinkedlist {
	
	public Node headNode;
	public Node tailNode;
	
	public void addNode(int data) {
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
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
	
	public int linearSearch(int value) {
		int tempValue = -1;
		int count = 0;
		Node currentNode = this.headNode;
		while (currentNode != null) {
			count++;
			if (currentNode.data == value) {
				return count;
			}
			currentNode = currentNode.next;
		}
		return tempValue;
	}
	
	public static void main(String[] args) {
		LinearSearchForLinkedlist obj = new LinearSearchForLinkedlist();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(8);
		obj.addNode(10);
		obj.display();
		System.out.println("the position "+ obj.linearSearch(10));
	}
}
