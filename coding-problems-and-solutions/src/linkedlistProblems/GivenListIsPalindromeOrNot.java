package linkedlistProblems;
import java.util.Stack;

public class GivenListIsPalindromeOrNot {
	
	class Node {
		char data;
		Node next;
		
		public Node(char data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node headNode = null;
	public Node tailNode = null;
	
	public void addData(char data) {
		Node newNode = new Node(data);
		if (this.headNode == null) {
			this.headNode = newNode;
			this.tailNode = newNode;
		}else {
			this.tailNode.next = newNode;
			this.tailNode = newNode;
		}
	}
	
	public static void checkPalindrom(GivenListIsPalindromeOrNot obj) {
		boolean isPalindrom = true;
		Stack<Character> tempStack = new Stack<>();
		Node currentNode = obj.headNode;
		while (currentNode != null) {
			tempStack.push(currentNode.data);
			currentNode = currentNode.next;
		}
		
		currentNode = obj.headNode;
		while (currentNode != null) {
			if (currentNode.data != tempStack.pop()) {
				isPalindrom = false;
				break;
			}
			currentNode = currentNode.next;
		}
		
		if (isPalindrom) {
			System.out.println("List is palindrome");
		}else {
			System.out.println("List is not palindrome");
		}
	}
	
	public static void main(String[] args) {
		GivenListIsPalindromeOrNot obj = new GivenListIsPalindromeOrNot();
		obj.addData('a');
		obj.addData('b');
		obj.addData('a');
		obj.addData('a');
		checkPalindrom(obj);
	}
}
