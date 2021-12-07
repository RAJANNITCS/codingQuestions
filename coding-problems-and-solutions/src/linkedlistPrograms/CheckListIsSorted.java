package linkedlistPrograms;

public class CheckListIsSorted {
	
	class Node {
		public int data;
		public Node next;
		
		public Node (int data) {
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
	
	public boolean checkIsListSorted() {
		boolean  isSorted = false;
		Node currentNode = this.headNode;
		int value = currentNode.data;
		currentNode = currentNode.next;
		while (currentNode != null) {
			if (currentNode.data > value) {
				value = currentNode.data;
				isSorted = true;
			}else {
				isSorted = false;
				break;
			}
			currentNode = currentNode.next;
		}
		return isSorted;
	}
	
	public static void main(String[] args) {
		CheckListIsSorted obj = new CheckListIsSorted();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(8);
		obj.addNode(10);
		obj.addNode(12);
		obj.addNode(14);
		obj.display();
		if (obj.checkIsListSorted()) {
			System.out.println("List is sorted");
		}else {
			System.out.println("List is not sorted");
		}
	}
}
