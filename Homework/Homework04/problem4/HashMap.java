import java.util.*;
//import java.util.Scanner;

public class HashMap{
  public static void main(String[] args){

      Scanner scan = new Scanner(System.in);
      System.out.println("Enter The array Size");
      int arraySize  = scan.nextInt();
      ArrayList<Integer> arrli  = new ArrayList<Integer>(Collections.nCopies(arraySize, 0));
      linearProbing Lp = new linearProbing();
      Lp.scanForElements(arrli, arraySize);
      //arrli.add(k,key);

  }
}
