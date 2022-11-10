package linkedlistCodingQuestions;

public class SumOfAllNodeValueInSinglyLinkedList {
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
	
	public int sumOfNode() {
		int sumOfNodeValue = 0;
		Node currentNode = headNode;
		while (currentNode != null) {
			sumOfNodeValue += currentNode.data;
			currentNode = currentNode.next;
		}
		return sumOfNodeValue;
	}
	
	public static void main(String[] args) {
		SumOfAllNodeValueInSinglyLinkedList obj = new SumOfAllNodeValueInSinglyLinkedList();
		obj.add(2);
		obj.add(3);
		obj.add(6);
		obj.add(1);
		System.out.println("sum of Node value is "+ obj.sumOfNode());
	}
}
