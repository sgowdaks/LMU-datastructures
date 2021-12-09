import java.util.*;
//import java.util.Scanner;

public class HashMap{
  public static void main(String[] args){

      Scanner scan = new Scanner(System.in);
      System.out.println("Enter The array Size");
      int arraySize  = scan.nextInt();
      ArrayList<String> arrli  = new ArrayList<String>(Collections.nCopies(arraySize, ""));
      LinearProbing ln = new LinearProbing();
      ln.scanForElements(arrli, arraySize);
      //arrli.add(k,key);

  }
}
