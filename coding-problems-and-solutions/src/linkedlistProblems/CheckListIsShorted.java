package linkedlistProblems;

public class CheckListIsShorted {
	
	class Node {
		public int data;
		public Node next;
		
		public Node(int data){
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
			tailNode.next = newNode;
			tailNode = newNode;
		}
	}
	
	public boolean checkShorted() {
		boolean isShorted = true;
		Node tailNode = null;
		Node currentNode = this.headNode;
		while (currentNode.next != null) {
			tailNode = currentNode;
			currentNode = currentNode.next;
			if (tailNode.data > currentNode.data) {
				isShorted = false;
				return isShorted;
			}
		}
		return isShorted;
	}
	
	public static void main(String[] args) {
		CheckListIsShorted obj = new CheckListIsShorted();
		obj.addNode(1);
		obj.addNode(4);
		obj.addNode(6);
		obj.addNode(8);
		obj.addNode(10);
		obj.addNode(12);
		if(obj.checkShorted()) {
			System.out.println("list is shorted");
		}else {
			System.out.println("list is not shoted");
		}
	}
}
