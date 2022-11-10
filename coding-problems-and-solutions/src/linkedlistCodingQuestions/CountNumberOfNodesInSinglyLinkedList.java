package linkedlistCodingQuestions;

public class CountNumberOfNodesInSinglyLinkedList {
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
	
	public int count() {
		int count = 0;
		Node currentNode = headNode;
		while (currentNode != null) {
			count++;
			currentNode = currentNode.next;
		}
		return count;
	}
	
	public static void main(String[] args) {
		CountNumberOfNodesInSinglyLinkedList obj = new CountNumberOfNodesInSinglyLinkedList();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		obj.add(10);
		obj.add(12);
		obj.add(14);
		System.out.println("Number of nodes "+ obj.count());
	}
}
