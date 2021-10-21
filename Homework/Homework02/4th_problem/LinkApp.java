

public class LinkApp {
public static void main(String[] args) {
        CreateList cl = new CreateList();
        //Adds data to the list
        cl.push(1);
        cl.push(2);
        cl.push(3);
        cl.push(4);
        cl.push(5);
        cl.push(6);
        //Displays all the nodes present in the list
        //cl.search(5);
        //cl.delete(5);
        cl.display();
        //String sf1=String.format("popped elemnt is %s",cl.pop());
        cl.pop();    //6
        cl.pop();    //5
        //System.out.println(sf1);
        //System.out.printf("Popped Item is: %d "+k);
        cl.display();



    }
  }
