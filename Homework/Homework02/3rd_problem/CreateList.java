//package hm22;

public class CreateList {
    //Represents the node of list.
    public class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    //Declaring head and tail pointer as null.
    //public Node head = null;
    public Node curr = null;
    public int Items = 0;


    public void nItems(){
      System.out.println(Items);
    }

    //This function will add the new node at the end of the list.
    public void add(int data){
        //Create new node
        Node newNode = new Node(data);
        //Checks if the list is empty.
        if(curr == null) {
             //If list is empty, both head and tail would point to new node.
            curr = newNode;
            newNode.next = curr;
            //curr = head;
            Items = Items +1;
        }
        else {
            //tail will point to new node.
            Node k = curr.next;
            curr.next = newNode;
            //New node will become new tail.
            newNode.next =  k;
            //Since, it is circular linked list tail will point to head.
            curr = newNode;
            Items = Items +1;
        }
    }

    //Displays all the nodes in the list
    public void display() {
        //Node current = curr;
        if(curr == null) {
            System.out.println("List is empty");
        }
        else {
            System.out.println("Nodes of the circular linked list: ");
             int Item = Items;
             while(Item > 0){
               System.out.println(curr.data);
               curr = curr.next;
               Item = Item - 1;
             }
        }
    }

    public void search(int data){
      if(curr == null) {
          System.out.println("the list is empty and the item is not present");
      }else{
        int Item = Items;
        while(Item > 0){
          if(curr.data == data){
            System.out.println("Its present");
            return ;
          }
          else{
            curr = curr.next;
            Item = Item - 1;
          }
        }
        System.out.println("Item is not present");
      }
    }


    public void delete(int data){
      if(curr == null) {
          System.out.println("the list is empty and the item is not present to delete");
      }else{
        int Item = Items;
        while(Item > 0){
          if(curr.next.data == data){
            Node front = curr.next;
            curr.next = front.next;
            Items = Items -1;
            return ;
          }
          else{
            curr = curr.next;
            Item = Item - 1;
          }
        }
      }
    }

    public void step(){
      if(curr == null) {
          System.out.println("the list is empty");
      }else{
        int Item = Items;
        while(Item > 0){
          System.out.println(curr.data);
          curr = curr.next;
          Item = Item -1;
    }
    System.out.println("***");
    curr = curr.next;

  }
}
}
