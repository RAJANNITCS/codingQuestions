package stack;

public class ParenthesisMatchingV2 {
	
	class Node{
		public int data;
		public Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node topNode = null;
	public String givenFromula = "{[(a + b )] * [(c - d)]}";
	
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
		Node currentNode = this.topNode;
		if (currentNode != null) {
			this.topNode = this.topNode.next;
			currentNode.next = null;
			return currentNode.data;
		}
		return -1;
	}
	
	public int topOfStack() {
		if (this.topNode != null) {
			return this.topNode.data;
		}
		return -1;
	}
	
	public boolean isEmpty() {
		if (this.topNode == null) {
			return true;
		}
		return false;
	}
	
	public static void checkParenthsisIsMatching(ParenthesisMatchingV2 obj) {
		for (int i = 0; i < obj.givenFromula.length(); i++) {
			if (obj.givenFromula.charAt(i) == '{' || obj.givenFromula.charAt(i) == '[' 
					|| obj.givenFromula.charAt(i) == '(') {
				obj.pushInStack(obj.givenFromula.charAt(i));
			}
			if (obj.givenFromula.charAt(i) == '}' || obj.givenFromula.charAt(i) == ']' 
					|| obj.givenFromula.charAt(i) == ')') {
				if (obj.isEmpty()) {
					System.out.println("Not match");
					return;
				}
				obj.popFromStack();
			}
		}
		if (obj.isEmpty()) {
			System.out.println("match");
		}else {
			System.out.println("Not match");
		}
	}
	
	public static void main(String[] args) {
		ParenthesisMatchingV2 obj = new ParenthesisMatchingV2();
		checkParenthsisIsMatching(obj);
	}
}
