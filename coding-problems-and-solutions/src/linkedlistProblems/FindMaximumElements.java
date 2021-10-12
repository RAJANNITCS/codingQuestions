package linkedlistProblems;

public class FindMaximumElements {
	
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
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if (this.headNode == null) {
			this.headNode = newNode;
			this.tailNode = newNode;
		}else {
			tailNode.next = newNode;
			tailNode = newNode;
		}
	}
	
	public int findMax() {
		Node currentNode = this.headNode;
		int maxValue = currentNode.data;
		
		while (currentNode != null) {
			if (currentNode.data > maxValue) {
				maxValue = currentNode.data;
			}
			currentNode = currentNode.next;
		}
		return maxValue;
	}
	
	public int findMaxV2(Node currentNode) {
		int maxValue = this.headNode.data;
		
		if (currentNode == null) {
			return maxValue;
		}else {
			maxValue = findMaxV2(currentNode.next);
			if (maxValue > currentNode.data) {
				return maxValue;
			}else {  
				return currentNode.data;
			}
		}
	}
	
	public static void main(String[] args) {
		FindMaximumElements obj = new FindMaximumElements();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(8);
		obj.addNode(10);
		obj.addNode(12);
//		System.out.println("this max element is " + obj.findMax());
		System.out.println("this max element is " + obj.findMaxV2(obj.headNode));
	}
}
