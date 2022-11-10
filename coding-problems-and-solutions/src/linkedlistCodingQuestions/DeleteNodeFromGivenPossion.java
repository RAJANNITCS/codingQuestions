package linkedlistCodingQuestions;

public class DeleteNodeFromGivenPossion {
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
	
	public int deleteNode(int poss) {
		int deleteValue = 0;
		Node currentNode = headNode;
		Node tailNode = null;
		if (poss == 1) {
			deleteValue = currentNode.data;
			headNode = headNode.next;
		}else {
			for (int i = 1; i < poss; i++) {
				tailNode = currentNode;
				currentNode = currentNode.next;
			}
			deleteValue = currentNode.data;
			tailNode.next = currentNode.next;
			currentNode.next = null;
		}
		return deleteValue;
	}
	
	public void display() {
		Node currentNode = headNode;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
	
	public static void main(String[] args) {
		DeleteNodeFromGivenPossion obj = new DeleteNodeFromGivenPossion();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		obj.add(10);
		obj.add(12);
		obj.display();
		System.out.println("after deleting value");
		System.out.println("delete value is "+ obj.deleteNode(1));
		obj.display();
	}
}
