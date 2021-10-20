class DequeTester{

public static void main(String[] args) {

    Deque theDeque = new Deque(5); // queue holds 5 items

    /*theDeque.remove();
    theDeque.remove();
    theDeque.remove();
    theDeque.remove();*/

    theDeque.insertLeft(100); // insert 4 items
    //theDeque.insertLeft(200);
    theDeque.insertRight(10);
    theDeque.insertRight(20);
    theDeque.insertRight(30);
    theDeque.insertRight(40);
    theDeque.insertRight(50);
    //theDeque.insertRight(60);
    //theDeque.removeLeft();
    //theDeque.removeRight();// remove 3 items
    //System.out.println(theDeque.queArray[4]);
    //System.out.println(theDeque.queArray[3]);
    //System.out.println(theDeque.queArray[2]);
    //System.out.println(theDeque.queArray[1]);
    //System.out.println(theDeque.queArray[0]);
    //theDeque.remove(); // (10, 20, 30)
    //theDeque.remove();
    //theDeque.insert(50); // insert 4 more items

    //theDeque.insert(60); // (wraps around)
    //theDeque.insert(70);
    //theDeque.insert(80);
    //theDeque.insert(1000);
    // while( !theDeque.isEmpty() ) // remove and display
    // {
    //
    //   long n = theDeque.remove(); // (40, 50, 60, 70, 80)
    //   System.out.print(n);
    //   System.out.print(" ");
    // }
    System.out.println(" ");
    theDeque.display();


    }
} // end class Deque
