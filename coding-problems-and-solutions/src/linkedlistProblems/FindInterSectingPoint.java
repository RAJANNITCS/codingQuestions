package linkedlistProblems;

public class FindInterSectingPoint {

	class Node {
		public int data;
		public Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node headNode = null;
	public Node tailNode = null;
	public Node[] tempStack = new Node[20];
	public int lengthOfStack = 0;
	
	public void pushInStack(Node currentNode) {
		if(this.lengthOfStack == 0) {
			this.tempStack[0] = currentNode;
			this.lengthOfStack++;
		}else {
			for (int i = this.lengthOfStack - 1; i >= 0; i--) {
				this.tempStack[i + 1] = this.tempStack[i];
			}
			this.tempStack[0] = currentNode;
			this.lengthOfStack++;
		}
	}
	
	public Node popFromStack() {
		Node currentNode = this.tempStack[0];
		for (int i = 0; i < this.lengthOfStack; i++) {
			this.tempStack[i] = this.tempStack[i + 1];
		}
		this.lengthOfStack--;
		return currentNode;
	}
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if (this.headNode == null) {
			this.headNode = newNode;
			this.tailNode = newNode;
		}else {
			tailNode.next = newNode;
			tailNode = newNode;
		}
	}
	
	public static void displayList(Node currentNode) {
		if (currentNode == null) {
			System.out.println("List is empty");
		}else {
			System.out.println("List is ");
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}
	
	public static void makeIntersectionPoint(Node firstList, Node secondList) {
		for (int i = 1; i < 4; i++) {
			if(firstList.next != null) {
				firstList = firstList.next;
			}
		}
		while (secondList.next != null) {
			secondList = secondList.next;
		}
		secondList.next = firstList;
	}
	
	public void allInStack(FindInterSectingPoint obj) {
		Node currentNode = obj.headNode;
		while (currentNode != null) {
			obj.pushInStack(currentNode);
			currentNode = currentNode.next;
		}
	}
	
	public void displayStack(FindInterSectingPoint obj) {
		System.out.println("stack print");
		for (int i = 0; i < obj.lengthOfStack ; i++) {
			System.out.println(this.tempStack[i].data);
		}
	}
	
	public static void checkInterSectionPoint(FindInterSectingPoint obj1, FindInterSectingPoint obj2) {
		Node tempNode = null;
		for (int i = 0; i < obj1.lengthOfStack && i < obj2.lengthOfStack ; i++) {
			tempNode = obj1.popFromStack();
			if (tempNode != obj2.popFromStack()) {
				return;
			}
		}
		System.out.println("Intersection point is "+ tempNode.data);
	}
	
	public static void main(String[] args) {
		FindInterSectingPoint obj1 = new FindInterSectingPoint();
		FindInterSectingPoint obj2 = new FindInterSectingPoint();
		obj1.addNode(2);
		obj1.addNode(4);
		obj1.addNode(6);
		obj1.addNode(8);
		obj1.addNode(10);
		obj1.addNode(12);
		obj1.addNode(14);
		obj2.addNode(3);
		obj2.addNode(6);
		obj2.addNode(9);
		obj2.addNode(13);
		
		makeIntersectionPoint(obj1.headNode, obj2.headNode);
		System.out.println("display first list");
		displayList(obj1.headNode);
		System.out.println("display second list");
		displayList(obj2.headNode);
		obj1.allInStack(obj1);
		obj1.displayStack(obj1);
		obj2.allInStack(obj2);
		obj2.displayStack(obj2);
		checkInterSectionPoint(obj1, obj2);
	}

}
