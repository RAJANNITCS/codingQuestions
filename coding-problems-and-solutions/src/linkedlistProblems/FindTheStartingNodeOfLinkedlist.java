package linkedlistProblems;
import java.util.Hashtable;

public class FindTheStartingNodeOfLinkedlist {
	
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
	
	public void makeLoop() {
		Node currentNode = this.headNode;
		Node tempNode = this.headNode;
		
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		tempNode = tempNode.next;
		tempNode = tempNode.next;
		currentNode.next = tempNode;
	}
	
	public void display() {
		Node currentNode = this.headNode;
		if (currentNode == null) {
			System.out.println("list is empty");
		}else {
			System.out.println("List is");
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}
	
	public void findStartingLoopNode() {
		boolean isLoop = false;
		Node currentNode = this.headNode;
		Hashtable<Node, Node> tempHt = new Hashtable<>();
		while (currentNode != null) {
			tempHt.put(currentNode, currentNode);
			try {
				if (tempHt.contains(currentNode.next)) {
					isLoop = true;
					break;
				}
			}catch(Exception e) {
				System.out.println("list not have a loop");
			}
			currentNode = currentNode.next;
		}
		if (isLoop) {
			System.out.println("start Node is " +currentNode.next.data);
		}
	}
	
	public static void main(String[] args) {
		FindTheStartingNodeOfLinkedlist obj = new FindTheStartingNodeOfLinkedlist();
		obj.addNode(2);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(8);
		obj.addNode(10);
		obj.addNode(12);
		obj.addNode(14);
		obj.addNode(16);
		obj.display();
		obj.makeLoop();
//		obj.display();
		obj.findStartingLoopNode();
	}
}
