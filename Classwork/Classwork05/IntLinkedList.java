package edu.lmu.cmsi2120.clw5;

public class IntLinkedList {

      private Node head;
      private int  size;

     // the constructor
      public IntLinkedList() {
         head = null;
         size = 0;
      }

      public int getSize() {
         return size;
      }

      public void prepend( int dataToAdd ) {
         Node currentHead = head;
         head = new Node( dataToAdd );
         head.next = currentHead;
         size++;
      }

      private class Node {

         int data;            // remember this is an IntLinkedList
         Node next;           // here's the self-referential part

         // constructor
         Node( int d ) {
            data = d;
            next = null;
         }
      }

      public Iterator getIteratorAt( int index ) {
         if( (index >= size) || (index < 0) ) {
            throw new IllegalArgumentException();
         }
         Iterator it = new Iterator();
         while( index > 0 ) {
            it.next();
            index--;
         }
         return it;
      }

      public void insertAt(int value, int index){
        Node newNode = new Node( value );
        Iterator ite = new Iterator();
        if(index == 0){
          Iterator k = getIteratorAt( 0 );
          newNode.next = k.getCurrentNode();
          this.head = newNode;

        }else{
        Iterator k = getIteratorAt( index-1 );
        Node front  = k.getCurrentNode();
        //System.out.println(front.data);
        Node back = front.next;
        front.next = newNode;
        newNode.next = back;
        //System.out.println(newNode.data);
      }
      this.size = this.size+1;
       }

       public int removeAt( int index){
         //Node newNode = new Node( value );
         //System.out.println(index);
         //Iterator k = getIteratorAt(0);
         if (index == 0){
           Iterator k = getIteratorAt(0);
            int val = k.getCurrentInt();
            k.next();
            this.head = k.getCurrentNode();
            return val;
          }
         Iterator k = getIteratorAt(index-1);
         Node front  = k.getCurrentNode();
         //System.out.println(front.data);
         k.next();
         Node middle = k.getCurrentNode();
         int val = middle.data;
         if(middle.next == null){
           front.next =  null;
           this.size = this.size -1;
           return val;
         }
         front.next = middle.next;
         this.size = this.size -1;
         //int val = ite.getCurrentInt();
         //ite.ne         // Node Back = ite.getCurrentNode();
         // front.next = Back;
         return val;
         //System.out.println(newNode.data);
        }



      public class Iterator {
         private Node currentNode;

         Iterator() {
            currentNode = head;
         }

         public void next() {
            if( currentNode == null ) {
               return;
            } else {
               currentNode = currentNode.next;
            }
         }

         public boolean hasNext() {
            return ((currentNode != null) && (currentNode.next != null));
         }

         public int getCurrentInt() {
            return currentNode.data;
         }

         public Node getCurrentNode() {
            return currentNode;
         }

      }
   }
