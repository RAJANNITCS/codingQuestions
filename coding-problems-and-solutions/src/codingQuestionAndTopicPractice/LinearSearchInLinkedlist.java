package codingQuestionAndTopicPractice;

class Node {
	public int data;
	public Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}


public class LinearSearchInLinkedlist {
	public Node headNode = null;
	public Node tailNode = null;
	
	public void addNode(int value) {
		Node newNode = new Node(value);
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
		int count = 0; 
		Node currentNode = this.headNode;
		while (currentNode != null) {
			count++;
			if (currentNode.data == value) {
				return count;
			}
			currentNode = currentNode.next;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		LinearSearchInLinkedlist obj = new LinearSearchInLinkedlist();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(8);
		obj.addNode(10);
		obj.display();
		System.out.println("position is "+ obj.linearSearch(6));
	}
}
