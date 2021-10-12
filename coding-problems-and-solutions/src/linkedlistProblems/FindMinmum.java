package linkedlistProblems;

public class FindMinmum {
	
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
	
	public int findMinimumElementV1() {
		Node currentNode = this.headNode;
		int minValue = currentNode.data;
		
		while (currentNode != null) {
			if (minValue > currentNode.data) {
				minValue = currentNode.data;
			}
			currentNode = currentNode.next;
		}
		return minValue;
	}
	
	public int findMinimumElementV2(Node currentNode) {
		int minValue = this.headNode.data;
		
		if (currentNode == null) {
			return minValue;
		}else {
			minValue = findMinimumElementV2(currentNode.next);
			if (minValue < currentNode.data) {
				return minValue;
			}else {
				return currentNode.data;
			}
		}
	}
	
	
	public static void main(String[] args) {
		FindMinmum obj = new FindMinmum();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(8);
		obj.addNode(10);
		obj.addNode(12);
		System.out.println("min value is =" + obj.findMinimumElementV1());
		System.out.println("min value is =" + obj.findMinimumElementV2(obj.headNode));
	}
	
}
