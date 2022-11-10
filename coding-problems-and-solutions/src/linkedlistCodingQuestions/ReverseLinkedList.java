	package linkedlistCodingQuestions;
	
	public class ReverseLinkedList {
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
		
		public void reverseLinkedlist() {
			Node tailNo2 = null;
			Node tailNo1 = null;
			Node currentNode = headNode;
			while (currentNode != null) {
				tailNo2 = tailNo1;
				tailNo1 = currentNode;
				currentNode = currentNode.next;
				tailNo1.next = tailNo2;
			}
			headNode = tailNo1;
		}
		
		public static void main(String[] args) {
			ReverseLinkedList obj = new ReverseLinkedList();
			obj.add(2);
			obj.add(4);
			obj.add(6);
			obj.add(8);
			obj.add(10);
			obj.add(12);
			obj.display();
			System.out.println("after reverse");
			obj.reverseLinkedlist();
			obj.display();
		}
	}
