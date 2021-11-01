package linkedlistProblems;
import java.util.Hashtable;

public class CloneRandomeAccessNode {
	
	public static class Node {
		int data;
		Node rendomNode;
		Node next;
		
		public Node (int data) {
			this.data = data;
			this.rendomNode = null;
			this.next = null;
		}
	}
	
	public Node headNode = null;
	public Node tailNode = null;
	public Node cloneOfList = null;
	public Hashtable<Integer, Node> tempht = new Hashtable<>();

	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if (this.headNode == null) {
			this.headNode = newNode;
			this.tailNode = newNode;
			this.tempht.put(this.headNode.data, this.headNode);
		}else {
			this.tailNode.next = newNode;
			this.tailNode = newNode;
			this.tempht.put(this.tailNode.data, this.tailNode);
		}
	}
	
	public static void display(Node currentNode) {
		if (currentNode == null) {
			System.out.println("List is empty");
		}else {
			System.out.println("List is ");
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}
	
	public static void makeLinkequeston(CloneRandomeAccessNode obj) {
		Node currentNode = obj.headNode;
		while (currentNode != null) {
			if (currentNode.data == 10) {
				currentNode.rendomNode = obj.tempht.get(30);
			}else if (currentNode.data == 20) {
				currentNode.rendomNode = obj.tempht.get(40);
			}else if (currentNode.data == 30) {
				currentNode.rendomNode = obj.tempht.get(20);
			}else if (currentNode.data == 40) {
				currentNode.rendomNode = obj.tempht.get(10);
			}
			currentNode = currentNode.next;
		}
	}
	
	public static void checkAndDisplay(Node currentNode) {
		if (currentNode == null) {
			System.out.println("list is empty");
		}else {
			System.out.println("list is");
			while (currentNode != null) {
				System.out.println(currentNode.rendomNode.data);
				currentNode = currentNode.next;
			}
		}
	}
	
	public static void makeClone(CloneRandomeAccessNode obj) {
		Node currentNode = obj.headNode;
		Node tailNode = null;
		Hashtable<Integer,Node> tempOfht = new Hashtable<>();
		while (currentNode != null) {
			Node newNode =  new Node(currentNode.data);
			if (obj.cloneOfList == null) {
				obj.cloneOfList = newNode;
				tailNode = newNode;
				tempOfht.put(obj.cloneOfList.data, obj.cloneOfList);
			}else {
				tailNode.next = newNode;
				tailNode = newNode;
				tempOfht.put(tailNode.data, tailNode);
			}
			currentNode = currentNode.next;
		}
		
		Node currentNode1 = obj.headNode;
		Node currentNode2 = obj.cloneOfList;
		
		while (currentNode1 != null && currentNode2 != null) {
			currentNode2.rendomNode = tempOfht.get(currentNode1.rendomNode.data);
			currentNode1 = currentNode1.next;
			currentNode2 = currentNode2.next;
		}
	}
	
	public static void main(String[] args) {
		CloneRandomeAccessNode obj = new CloneRandomeAccessNode();
		obj.addNode(10);
		obj.addNode(20);
		obj.addNode(30);
		obj.addNode(40);
		display(obj.headNode);
		System.out.println(obj.tempht);
		makeLinkequeston(obj);
		checkAndDisplay(obj.headNode);
		makeClone(obj);
		display(obj.cloneOfList);
		checkAndDisplay(obj.cloneOfList);
	}
}
