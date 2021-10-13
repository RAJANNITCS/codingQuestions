package linkedlistProblems;

public class MergeTwoList {
	
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
	
	public static void display(Node currentNode) {
		if (currentNode == null) {
			System.out.println("List is empty");
		}else {
			System.out.println("list is");
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}
	
	public static Node mergeTwoList(Node first, Node second) {
		Node thirdNode = null;
		Node lastNode = null;
		
		if (first.data < second.data) {
			thirdNode = first;
			lastNode = first;
			first = first.next;
		}else {
			thirdNode = second;
			lastNode = second;
			second = second.next;
		}
		
		while (first != null && second != null) {
			if (first.data < second.data) {
				lastNode.next = first;
				lastNode = first;
				first = first.next;
				lastNode.next = null;
			}else {
				lastNode.next = second;
				lastNode = second;
				second = second.next;
				lastNode.next = null;
			}
		}
		if (first != null) {
			lastNode.next = first;
		}
		if (second != null) {
			lastNode.next = second;
		}
		
		return thirdNode;
	}
	
	public static void main(String[] args) {
		MergeTwoList firstList = new MergeTwoList();
		MergeTwoList secondList = new MergeTwoList();
		
		firstList.addNode(2);
		firstList.addNode(4);
		firstList.addNode(6);
		firstList.addNode(8);
		firstList.addNode(10);
		firstList.addNode(12);
		secondList.addNode(3);
		secondList.addNode(9);
		secondList.addNode(15);
		
		Node third = null;
		third = mergeTwoList(firstList.headNode, secondList.headNode);
		display(third);
	}
}
