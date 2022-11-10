package linkedlistCodingQuestions;
import java.util.HashSet;

public class IsLinkedlistHavingLoop {
	public Node headNode = null;
	public Node tailNode = null;
	
	public void add(int data) {
		Node newNode = new Node(data);
		if (headNode == null) {
			headNode = newNode;
			tailNode = newNode;
//			tailNode.next = headNode;
		}else {
			tailNode.next = newNode;
			tailNode = newNode;
//			tailNode.next = headNode;
		}
	}
	
	public void display() {
		Node currentNode = headNode;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
	
	public boolean checkListHavingLoop() {
		boolean isHaveLoop = false;
		HashSet<Node> tempHash = new HashSet<Node>();
		Node currentNode = headNode;
		while (currentNode != null) {
			if (!tempHash.contains(currentNode)) {
				tempHash.add(currentNode);
				isHaveLoop = false;
				currentNode = currentNode.next;
			}else {
				return true;
			}
		}
		return isHaveLoop;
	}
	
	public static void main(String[] args) {
		IsLinkedlistHavingLoop obj = new IsLinkedlistHavingLoop();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		obj.add(10);
		obj.add(12);
		obj.display();
		System.out.println(obj.checkListHavingLoop());
	}
}
