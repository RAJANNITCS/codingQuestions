package linkedlistCodingQuestions;

public class CheckSinglyLinkedListIsSorted {
	public Node headNode = null;
	public Node tailNode = null;
	
	public void add(int data) {
		Node newNode = new Node(data);
		if (headNode == null) {
			headNode = newNode;
			tailNode = newNode;
		}else {
			tailNode.next = newNode;
			tailNode = newNode;
		}
	}
	
	public boolean checkLinkedListSorted() {
		boolean isSorted = true;
		Node currentNode = headNode;
		Node tailNode = currentNode;
		if (currentNode != null) {
			currentNode = currentNode.next;
		}
		while (currentNode != null) {
			if (!(tailNode.data < currentNode.data)) {
				isSorted = false;
				return isSorted;
			}
			tailNode = currentNode;
			currentNode = currentNode.next;
		}
		return isSorted;
	}
	
	public static void main(String[] args) {
		CheckSinglyLinkedListIsSorted obj = new CheckSinglyLinkedListIsSorted();
		obj.add(2);
		obj.add(4);
		obj.add(16);
		obj.add(8);
		obj.add(10);
		if (obj.checkLinkedListSorted()) {
			System.out.println("list is sorted");
		}else {
			System.out.println("list is not sorted");
		}
	}
}
