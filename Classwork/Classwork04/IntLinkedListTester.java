package edu.lmu.cmsi2120.hw4;

public class IntLinkedListTester {

      public static void main( String[] args ) {
         IntLinkedList myList = new IntLinkedList();
         myList.prepend( 23 );
         myList.prepend( 19 );
         myList.prepend( 17 );
         myList.prepend( 13 );
         myList.prepend( 11 );
         myList.prepend(  7 );
         myList.prepend(  5 );
         myList.prepend(  3 );
         myList.prepend(  2 );
         myList.insertAt(100,1);
         myList.insertAt(8,0);
         int val = myList.removeAt(myList.getSize()-1);
         //System.out.println("heelo");
         //System.out.println(myLis;

         // int val2 = myList.removeAt((myList.getSize()));
         // int val3 = myList.removeAt((myList.getSize()));
         IntLinkedList.Iterator myIt = myList.getIteratorAt( 0 );
         //int val = myList.removeAt(myIt.size-1);
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 2
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 3
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 5
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 7
         //myIt = myList.getIteratorAt( 3 );
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 7
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 11
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 13
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() ); //17
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );
         System.out.println("Current Value removed is: "+ val );
         // System.out.println("Current Value removed is: "+ val2);
         // System.out.println("Current Value removed is: "+ val3);


      }
   }
