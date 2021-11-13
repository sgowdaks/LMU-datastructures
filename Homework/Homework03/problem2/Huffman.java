
// package newpro;

import java.util.*;

public class Huffman {


   public static void main(String[] args) {


    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter The text");

    String text = myObj.nextLine();
      //String test = "Hello how are you doing";
      System.out.println("Original Text = "+text);
      HuffmanTest ht = new HuffmanTest();
      String s = ht.encode(text);
      //String s = encode(test);
      ht.decode(s);

   }
}
