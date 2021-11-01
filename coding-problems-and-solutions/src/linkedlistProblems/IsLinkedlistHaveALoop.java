package linkedlistProblems;
import java.util.Hashtable;

public class IsLinkedlistHaveALoop {
	
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
	
	public void addData(int data) {
		Node newNode = new Node(data);
		if (this.headNode == null) {
			this.headNode = newNode;
			this.tailNode = newNode;
		}else {
			this.tailNode.next = newNode;
			this.tailNode = newNode;
		}
	}
	
	public void findLoopV1() {
		boolean isLoop = false;
		Node currentNode = this.headNode;
		Node tailNode = this.headNode;
		while (currentNode != null) {
			tailNode = tailNode.next;
			currentNode = currentNode.next;
			if (currentNode != null && currentNode.next != null) {
				currentNode = currentNode.next;
			}
			if (currentNode != null && tailNode != null && currentNode == tailNode ) {
				isLoop = true;
				break;
			}
		}
		if (isLoop) {
			System.out.println("there is a loop in linkedlist");
		}
	}
	
	public void findLoopV2() {
		boolean isLoop = false;
		Hashtable<Node, Node> tempht = new Hashtable<>();
		Node currentNode = this.headNode;
		while (currentNode != null) {
			tempht.put(currentNode, currentNode);
			currentNode = currentNode.next;
			try {
				if(tempht.contains(currentNode.next)) {
					isLoop = true;
					break;
				}
			}catch (Exception e) {
				isLoop = false;
				break;
			}
			
		}
		if (isLoop) {
			System.out.println("there is a loop in linkedlist");
		}
	}
	
	public void makeLoop() {
		Node curretNode = this.headNode;
		Node tempNode = this.headNode;
		
		while (curretNode.next != null) {
			curretNode = curretNode.next;
		}
		tempNode = tempNode.next;
		tempNode = tempNode.next;
		curretNode.next = tempNode;
	}
	
	public void display() {
		Node currentNode = this.headNode;
		if (currentNode == null) {
			System.out.println("List is empty");
		}else {
			System.out.println("List is");
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}
	
	public static void main(String[] args) {
		IsLinkedlistHaveALoop obj = new IsLinkedlistHaveALoop();
		obj.addData(2);
		obj.addData(4);
		obj.addData(6);
		obj.addData(8);
		obj.addData(10);
		obj.addData(12);
		obj.addData(14);
		obj.display();
		obj.makeLoop();
//		obj.display();
//		obj.findLoopV1();
		obj.findLoopV2();
		
	}
}
