package linkedlistCodingQuestions;

public class FindMiddleNodeOfLinkedList {
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
	
	public void display() {
		Node currentNode = headNode;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
	
	public void findMiddlePoint() {
		int count = 0;
		Node currentNode = headNode;
		while (currentNode != null) {
			count++;
			currentNode = currentNode.next;
		}
		
		count = count/2;
		currentNode = headNode;
		for (int i = 1; i <= count; i++) {
			currentNode = currentNode.next;
		}
		System.out.println("Middle Node "+currentNode.data);
	}
	
	public static void main(String[] args) {
		FindMiddleNodeOfLinkedList obj = new FindMiddleNodeOfLinkedList();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		obj.add(10);
		obj.add(12);
		obj.add(14);
		obj.display();
		obj.findMiddlePoint();
	}
}
