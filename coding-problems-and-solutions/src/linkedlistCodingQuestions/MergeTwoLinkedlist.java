package linkedlistCodingQuestions;

public class MergeTwoLinkedlist {
	public Node headNode;
	public Node tailNode;
	
	public static void add(MergeTwoLinkedlist obj,int data) {
		Node newNode = new Node(data);
		if (obj.headNode == null) {
			obj.headNode = newNode;
			obj.tailNode = newNode;
		}else {
			obj.tailNode.next = newNode;
			obj.tailNode = newNode;
		}
	}
	
	public static void display(Node currentNode) {
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;

		}
	}
	
	public static Node mergerTwoLinkedlist(Node firstNode, Node secondNode) {
		Node thiredNode = null;
		Node currentNode = null;
		
		if (firstNode.data < secondNode.data) {
			thiredNode = firstNode;
			currentNode = firstNode;
			firstNode = firstNode.next;
		}else {
			thiredNode = secondNode;
			currentNode = secondNode;
			secondNode = secondNode.next;
		}
		
		while (firstNode != null && secondNode != null) {
			if (firstNode.data < secondNode.data) {
				currentNode.next = firstNode;
				currentNode = firstNode;
				firstNode = firstNode.next;
			}else {
				currentNode.next = secondNode;
				currentNode = secondNode;
				secondNode = secondNode.next;
			}
		}
		
		return thiredNode;
	}
	
	public static void main(String[] args) {
		MergeTwoLinkedlist obj_1 = new MergeTwoLinkedlist();
		MergeTwoLinkedlist obj_2 = new MergeTwoLinkedlist();
		add(obj_1, 2);
		add(obj_1, 8);
		add(obj_1, 10);
		add(obj_1, 15);
		add(obj_2, 4);
		add(obj_2, 7);
		add(obj_2, 12);
		add(obj_2, 14);
		Node currentNode = mergerTwoLinkedlist(obj_1.headNode, obj_2.headNode);
		display(currentNode);
	}
}
