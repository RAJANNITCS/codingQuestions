package linkedlistCodingQuestions;

public class ConcatinatingTwoLinkedlist {
	public Node headNode = null;
	public Node tailNode = null;
	
	public static void add(ConcatinatingTwoLinkedlist obj, int data) {
		Node newNode = new Node(data);
		if (obj.headNode == null) {
			obj.headNode = newNode;
			obj.tailNode = newNode;
		}else {
			obj.tailNode.next = newNode;
			obj.tailNode = newNode;
		}
	}
	
	public static void display(ConcatinatingTwoLinkedlist obj) {
		Node currentNode = obj.headNode;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
	
	public static void concartingTwoLinkedlist(ConcatinatingTwoLinkedlist obj_1,ConcatinatingTwoLinkedlist obj_2) {
		Node currentNode = obj_1.headNode;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		
		currentNode.next = obj_2.headNode;
	}
	
	public static void main(String[] args) {
		ConcatinatingTwoLinkedlist obj_1 = new ConcatinatingTwoLinkedlist();
		ConcatinatingTwoLinkedlist obj_2 = new ConcatinatingTwoLinkedlist();
		add(obj_1, 2);
		add(obj_1, 4);
		add(obj_1, 6);
		add(obj_1, 8);
		add(obj_1, 10);
		add(obj_2, 3);
		add(obj_2, 6);
		add(obj_2, 9);
		concartingTwoLinkedlist(obj_1, obj_2);
		display(obj_1);
		
	}
}
