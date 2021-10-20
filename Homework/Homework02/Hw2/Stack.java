public class Stack{


public class Node {

    int data;            // remember this is an IntLinkedList
    Node next;
    Node top;
    Node previous;
    // constructor
    Node( int d ) {
        data = d;
        previous = null;
        next = null;
        top = null;
     }
 }

public int size = 0;

    Node next;
    Node top;
    Node previous;
    int data;



public void push(int value) {
	Node newNode = new Node(value);

	if(top == null) {
            top = newNode;
            newNode.previous = top;
            size++;
        }
        else {
        	Node placeholder = top;
        	newNode.previous = top;
        	top = newNode;
        	size ++;
        	// NewNode points to top and adds new node
        	/**
        	Node placeholder = top.next;
        	top.next = newNode;
        	newNode.next = placeholder;
        	previous = top;
            size++;
            */
        }
}

    public void pop() {
    	this.previous = top;
    	size--;
    }

    public int peek() {
    	return top.data;
    }
}