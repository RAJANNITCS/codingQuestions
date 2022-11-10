package linkedlistCodingQuestions;

public class FindMaxAndMinFromSinglyLinkedlist {
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
	
	public int findMaxValue() {
		int maxValue = headNode != null? headNode.data : 0;
		Node currentNode = headNode;
		while (currentNode != null) {
			if (currentNode.data > maxValue) {
				maxValue = currentNode.data;
			}
			currentNode = currentNode.next;
		}
		return maxValue;
	}
	
	public int findMinValue() {
		int minValue = headNode != null? headNode.data: 0;
		Node currentNode = headNode;
		while (currentNode != null) {
			if (minValue > currentNode.data) {
				minValue = currentNode.data;
			}
			currentNode = currentNode.next;
		}
		return minValue;
	}
	
	public static void main(String[] args) {
		FindMaxAndMinFromSinglyLinkedlist obj = new FindMaxAndMinFromSinglyLinkedlist();
		obj.add(2);
		obj.add(5);
		obj.add(22);
		obj.add(1);
		obj.add(444);
		System.out.println("max value is "+ obj.findMaxValue());
		System.out.println("min value is "+ obj.findMinValue());
	}
}
