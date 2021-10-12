package linkedlistProblems;

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
	
	public int sumOfAllNodeV1() {
		int sumOfNode = 0;
		Node currentNode = this.headNode;
		while (currentNode != null) {
			sumOfNode += currentNode.data;
			currentNode = currentNode.next;
		}
		return sumOfNode;
	}
	
	public int sumOfAllNodeV2(Node currentNode) {
		if (currentNode == null) {
			return 0;
		}else {
			return sumOfAllNodeV2(currentNode.next) + currentNode.data;
		}
	}
	
	public int sumOfAllNodeV3(Node currentNode) {
		if (currentNode != null) {
			return sumOfAllNodeV3(currentNode.next) + currentNode.data;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		SumOfAllElements obj = new SumOfAllElements();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(8);
		obj.addNode(10);
//		System.out.println("sum of all elements =" + obj.sumOfAllNodeV1());
//		System.out.println("sum of all elements = " + obj.sumOfAllNodeV2(obj.headNode));
		System.out.println("sum of all elemenets = "+ obj.sumOfAllNodeV3(obj.headNode));
	}
}
