package linkedlistProblems;

public class FindTheMergeingPoint {
	
	class Node {
		public int data;
		public Node next;
		
		public Node (int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node firstList = null;
	public Node tailNode1 = null;
	public Node secondList = null;
	public Node tailNode2 = null;
	
	public void addNode1(int data) {
		Node newNode = new Node(data);
		if (this.firstList == null) {
			this.firstList = newNode;
			this.tailNode1 = newNode;
		}else {
			this.tailNode1.next = newNode;
			this.tailNode1 = newNode;
		}
	}
	
	public void addNode2(int data) {
		Node newNode = new Node(data);
		if (this.secondList == null) {
			this.secondList = newNode;
			this.tailNode2 = newNode;
		}else {
			this.tailNode2.next = newNode;
			this.tailNode2 = newNode;
		}
	}
	
	public static void display(Node headNode) {
		if (headNode == null) {
			System.out.println("List is empty");
		}else {
			System.out.println("list is ");
			while (headNode != null) {
				System.out.println(headNode.data);
				headNode = headNode.next;
			}
		}
	}
	
	public static void findMergingPoint(FindTheMergeingPoint obj) {
		Node mergePointNode = null;
		Node secondTemp = obj.secondList;
		while (secondTemp != null ) {
			Node firstTemp = obj.firstList;
			while (firstTemp != null) {
				if (secondTemp.next == firstTemp) {
					mergePointNode = firstTemp;
					break;
				}
				firstTemp = firstTemp.next;
				if (mergePointNode != null) {
					break;
				}
			}
			secondTemp = secondTemp.next;
		}
		
		System.out.println("merge pont is"+mergePointNode.data);
	}
	
	public static void createMergePoint(FindTheMergeingPoint obj) {
		Node currentNode = obj.firstList;
		Node secondeList = obj.secondList;
		
		for (int i = 1; i < 4; i++) {
			currentNode = currentNode.next;
		}
		
		while (secondeList.next != null) {
			secondeList = secondeList.next;
		}
		secondeList.next = currentNode;
	}
	
	public static void main(String[] args) {
		FindTheMergeingPoint obj = new FindTheMergeingPoint();
		obj.addNode1(2);
		obj.addNode1(4);
		obj.addNode1(6);
		obj.addNode1(8);
		obj.addNode1(10);
		obj.addNode1(12);
		obj.addNode1(14);
		obj.addNode1(16);
		obj.addNode2(3);
		obj.addNode2(6);
		obj.addNode2(9);
		obj.addNode2(11);
		obj.addNode2(15);
		createMergePoint(obj);
		display(obj.secondList);
		findMergingPoint(obj);
}
}
