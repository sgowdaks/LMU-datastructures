package edu.lmu.cmsi2120.clw5;

public class IntQueue {

    IntLinkedList myQueue;

    IntQueue() {
       myQueue = new IntLinkedList();         // constructor
    }

    public void push( int itemToPush ) {
       myQueue.prepend( itemToPush );
    }

    public int peek() {
       return myQueue.getIteratorAt(0).getCurrentInt();    // we use the iterator
    }

    public int pop() {
       //System.out.println(myQueue.getSize());
       //int size = myQueue.getSize() - 1;
       return myQueue.removeAt(myQueue.getSize()-1);
    }

    public static void main( String[] args ) {
       IntQueue testQueue = new IntQueue();
       testQueue.push( 19 );
       testQueue.push( 23 );
       testQueue.push( 29 );
       testQueue.push( 31 );
       testQueue.push( 37 );
       testQueue.push( 41 );
       testQueue.push( 43 );
       testQueue.push( 47 );
       testQueue.push( 51 );
       testQueue.push( 57 );
       //IntLinkedList.Iterator myIt = myList.getIteratorAt( 0 );

       System.out.println( "The top of the stack: " + testQueue.peek() );      // 57
       System.out.println( "Removing top thing: " + testQueue.pop() );         // 57 removed
       System.out.println( "The top of the stack: " + testQueue.peek() );      // 51
       System.out.println( "Removing top thing: " + testQueue.pop() );         // 51 removed
       System.out.println( "The top of the stack: " + testQueue.peek() );      // 47
       System.out.println( "Removing top thing: " + testQueue.pop() );         // 47 removed
       System.out.println( "The top of the stack: " + testQueue.peek() );      // 43
       testQueue.push( testQueue.pop() + testQueue.pop() );
       System.out.println( "The top of the stack: " + testQueue.peek() );      // what'll it be?
    }

 }
