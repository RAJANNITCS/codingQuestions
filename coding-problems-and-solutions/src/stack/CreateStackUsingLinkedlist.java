package stack;

public class CreateStackUsingLinkedlist {
	
	class Node {
		public int data;
		public Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node topNode;
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if (this.topNode == null) {
			this.topNode = newNode;
		}else {
			newNode.next = this.topNode;
			this.topNode = newNode;
		}
	}
	
	public void pushInStack(int data) {
		Node newNode = new Node(data);
		if (this.topNode == null) {
			this.topNode = newNode;
		}else {
			newNode.next = this.topNode;
			this.topNode = newNode;
		}
	}
	
	public int popFromStack() {
		int value = 0;
		Node currentNode = this.topNode;
		
		if (this.topNode == null) {
			System.out.println("Stack is empty");
		}else {
			value = currentNode.data;
			this.topNode = this.topNode.next;
			currentNode.next = null;
		}
		return value;
	}
	
	public int peekFromStack(int index) {
		Node currentNode = this.topNode;
		if (currentNode == null) {
			System.out.println("Stack is empty");
		}else {
			for (int i = 1; i < index; i++) {
				currentNode = currentNode.next;
			}
			return currentNode.data;
		}
		return -1;
	}
	
	public void displayStack() {
		Node currentNode = this.topNode;
		if (currentNode == null) {
			System.out.println("Stack is empty");
		}else {
			System.out.println("Stack is print");
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}
	
	public int stackTop() {
		if (this.topNode == null) {
			System.out.println("Stack is empty");
		}else {
			return this.topNode.data;
		}
		return -1; 
	}
	
	public void isEmpty() {
		if (this.topNode == null) {
			System.out.println("Stack is empty");
		}
	}
	
	public static void main(String[] args) {
		CreateStackUsingLinkedlist obj = new CreateStackUsingLinkedlist();
		obj.addNode(2);
		obj.addNode(4);
//		obj.addNode(6);
//		obj.addNode(8);
//		obj.addNode(10);
//		obj.addNode(12);
//		obj.displayStack();
//		obj.pushInStack(22);
//		obj.displayStack();
//		System.out.println("pop from stack = "+ obj.popFromStack());
//		obj.displayStack();
//		System.out.println("peek from stack 3 value is "+ obj.peekFromStack(3));
//		System.out.println("stack top is "+ obj.stackTop());
		obj.popFromStack();
		obj.popFromStack();
		obj.isEmpty();
		
}
}
