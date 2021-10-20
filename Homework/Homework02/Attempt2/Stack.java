public class Stack {

	private Node top;
	private int size;

	private class Node {

		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void push(int data) {
		Node placeholer = new Node(data);
		placeholer.next = top;
		top = placeholer;
		size++;
	}

	public int pop() {
		top = top.next;
	}

	public int peek() {
		return top.data;
	}
}