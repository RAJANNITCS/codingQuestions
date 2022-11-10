package linkedlistCodingQuestions;

public class MoveToHeadNode {
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
	
	public int moveToFront(int key) {
		Node currentNode = headNode;
		Node tailNode = null;
		int count = 1;
		if (currentNode != null) {
			if (key == currentNode.data) {
				return count;
			}
		}
		while (currentNode.data != key) {
			count++;
			tailNode = currentNode;
			currentNode = currentNode.next;
		}
		
		tailNode.next = currentNode.next;
		currentNode.next = headNode;
		headNode = currentNode;
		
		return count;
		
	}
 	public static void main(String[] args) {
		MoveToHeadNode obj = new MoveToHeadNode();
		obj.add(2);
		obj.add(5);
		obj.add(6);
		obj.add(8);
		obj.add(10);
		obj.add(12);
		obj.display();
		System.out.println("after mover");
		System.out.println("positions is "+ obj.moveToFront(6));
		obj.display();
		System.out.println("positions is "+ obj.moveToFront(6));
		obj.display();
		
	}
}
