package linkedlistCodingQuestions;

public class LinearSearchForLinkedlist {
	public Node headNode = null;
	public Node tailNode = null;
	
	
	public void add(int value) {
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
		if (currentNode != null) {
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
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
		LinearSearchForLinkedlist obj = new LinearSearchForLinkedlist();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		obj.add(10);
		obj.add(12);
		obj.display();
		System.out.println("possition is" + obj.linearSearch(8));
	}
}
