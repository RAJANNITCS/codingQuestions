package linkedlistPrograms;

public class SumOfAllElements {
	
	class Node {
		public int data;
		public Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
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
			System.out.println("List is empty");
		}else {
			System.out.println("List elements are");
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}
	
	public int sumOfallElements() {
		int sumValue = 0;
		Node currentNode = this.headNode;
		while (currentNode != null) {
			sumValue += currentNode.data;
			currentNode = currentNode.next;
		}
		return sumValue;
	}
	
	public static void main(String[] args) {
		SumOfAllElements obj = new SumOfAllElements();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		obj.add(10);
		obj.add(12);
		obj.display();
		System.out.println("sum of all elements " + obj.sumOfallElements());
	}
	
}
