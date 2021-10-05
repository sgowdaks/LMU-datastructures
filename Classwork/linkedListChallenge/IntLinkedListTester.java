package edu.lmu.cmsi2120.challen;


public class IntLinkedListTester {

      public static void main( String[] args ) {
         IntLinkedList myList1 = new IntLinkedList();
         IntLinkedList myList2 = new IntLinkedList();
         IntLinkedList myList3 = new IntLinkedList();
         myList1.prepend( 8 );
         myList1.prepend( 3 );
         myList1.prepend( 5 );
         myList1.prepend( 7 );
         myList1.prepend( 4 );
         myList2.prepend(  8 );
         myList2.prepend(  8 );
         myList2.prepend(  1 );
         myList2.prepend(  8 );
         myList2.prepend(  9 );
         myList2.prepend(  2 );
         myList2.prepend(  7 );
         IntLinkedList.Iterator myIt1 = myList1.getIteratorAt( 0 );
         IntLinkedList.Iterator myIt2 = myList2.getIteratorAt( 0 );

         int l1 = myList1.getSize();
         int l2 = myList2.getSize();
         int count = 0;
         if(l1<l2){
           count = l1;
         }else{
           count = l2;
         }
         int add = 0;
         int carry = 0;
         int k;
         for (int i = 0;i<count;i++){
           add = myIt2.getCurrentInt() + myIt1.getCurrentInt()+carry;
           carry = 0;
           myList3.prepend(  add%10 );
           if(add/10 != 0){
             carry = add/10;
           }
           myIt1.next();
           myIt2.next();
         }
          int z;
          int max = 0;
           if(l1>l2){
             max = l1;
             z = l1-l2;
             while(z>0){
                myList3.prepend(myIt1.getCurrentInt()+carry);
                carry = 0;
                z = z-1;
             }
           }else{
             max = l2;
             z = l2-l1;
             while(z>0){
                myList3.prepend(myIt2.getCurrentInt()+carry);
                carry = 0;
                z = z-1;
             }
           }

        IntLinkedList.Iterator myIt3 = myList3.getIteratorAt( 0 );
         for(int i=0;i<max;i++){
           System.out.println( "Current Node is: " + myIt3.getCurrentInt() );
           myIt3.next();
         }

      }
   }
