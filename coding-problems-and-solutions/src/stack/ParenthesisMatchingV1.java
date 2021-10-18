package stack;

public class ParenthesisMatchingV1 {
	
	class Node {
		public int data;
		public Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node topNode = null;
	String givenFormula = "(( a + b ) * ( c - d ))";
	
	public void pushInStack(int data) {
		Node newNode = new Node(data);
		if (this.topNode == null) {
			this.topNode = newNode;
		}else {
			newNode.next = this.topNode;
			this.topNode = newNode;
		}
	}
	
	public int popFromNode() {
		Node currentNode = this.topNode;
		
		if(this.topNode != null) {
			this.topNode = this.topNode.next;
			currentNode.next = null;
			return currentNode.data;
		}
		return -1;
	}
	
	public int stackTop() {
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
	
	public void checkParenthesisMatch(ParenthesisMatchingV1 obj) {
		for (int i = 0; i < this.givenFormula.length(); i++) {
			if (this.givenFormula.charAt(i) == '(') {
				obj.pushInStack(this.givenFormula.charAt(i));
			}
			if (this.givenFormula.charAt(i) == ')') {
				if (obj.isEmpty()) {
					System.out.println("Not match");
					return;
				}
				obj.popFromNode();
			}
		}
		if (isEmpty()) {
			System.out.println("Match");
		}else {
			System.out.println("Not Match");
		}
		
	}
	
	public static void main(String[] args) {
		ParenthesisMatchingV1 obj = new ParenthesisMatchingV1();
		obj.checkParenthesisMatch(obj);
	}
}
