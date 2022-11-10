package linkedlistCodingQuestions;
import java.util.HashSet;

public class FindMergingPoint {
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
	
	public static void mergeTwoList(Node listOne,Node listTwo) {
		while (listTwo.next != null) {
			listTwo = listTwo.next;
		}
		
		for (int i = 1; i < 4; i++) {
			listOne = listOne.next;
		}
		
		listTwo.next = listOne;
	}
	
	public static void findMergingPoint(Node listOne,Node listTwo) {
		HashSet<Node> temp1 = new HashSet<Node>();
		
		while (listOne != null) {
			temp1.add(listOne);
			listOne = listOne.next;
		}
		
		while (listTwo != null) {
			if (temp1.contains(listTwo)) {
				System.out.println(listTwo.data);
				break;
			}else {
				listTwo = listTwo.next;
			}
		}
	}
	
	
	public static void main(String[] args) {
		FindMergingPoint listOne = new FindMergingPoint();
		FindMergingPoint listTwo = new FindMergingPoint();
		listOne.add(2);
		listOne.add(4);
		listOne.add(6);
		listOne.add(8);
		listOne.add(10);
		listOne.add(12);
		listOne.add(14);
		listTwo.add(3);
		listTwo.add(6);
		listTwo.add(9);
		listTwo.add(12);
		listTwo.add(15);
		mergeTwoList(listOne.headNode, listTwo.headNode);
//		listTwo.display();
		findMergingPoint(listOne.headNode, listTwo.headNode);
	}
}
