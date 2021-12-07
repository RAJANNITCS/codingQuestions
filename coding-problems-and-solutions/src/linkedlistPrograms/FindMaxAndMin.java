package linkedlistPrograms;

public class FindMaxAndMin {
	
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
			System.out.println("List elements are ");
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}
	
	public int findMinElement() {
		int minValue = this.headNode.data;
		Node currentNode = this.headNode;
		while (currentNode != null) {
			if (minValue > currentNode.data) {
				minValue = currentNode.data;
			}
			currentNode = currentNode.next;
		}
		return minValue;
	}
	
	public int findMaxElement() {
		int maxValue = this.headNode.data;
		Node currentNode = this.headNode;
		while (currentNode != null) {
			if (currentNode.data > maxValue) {
				maxValue = currentNode.data;
			}
			currentNode = currentNode.next;
		}
		
		return maxValue;
	}
	
	public static void main(String[] args) {
		FindMaxAndMin obj = new FindMaxAndMin();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		obj.add(10);
		obj.add(12);
		obj.display();
		System.out.println("min element is "+ obj.findMinElement());
		System.out.println("max element is "+ obj.findMaxElement());
	}
}
