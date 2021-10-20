//package hm22;

public class LinkApp {
   public static void main(String[] args) {
        CreateList cl = new CreateList();
        //Adds data to the list
        cl.add(1);
        cl.add(2);
        cl.add(3);
        cl.add(4);
        cl.add(5);
        cl.add(6);
        //Displays all the nodes present in the list
        cl.search(5);
        //cl.delete(5);
        cl.display();
        cl.delete(5);
        cl.display();
        cl.search(5);
        cl.step();
        cl.step();
        cl.step();
    }
  }
