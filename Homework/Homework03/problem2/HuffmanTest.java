// package newpro;
import java.util.*;

class HuffmanTest{
  public static Map<Character,String> EncodedLetterList = new HashMap<>();
   static HuffmanNode root;

  public static HuffmanNode buildTree(Map<Character, Integer> freq) {

      PriorityQueue<HuffmanNode> pQ = new PriorityQueue<>();
      Set<Character> keySet = freq.keySet();
      //System.out.println(KeySet)
      for (Character c : keySet) {

         HuffmanNode huffmanNode = new HuffmanNode();
         huffmanNode.data = c;
         huffmanNode.frequency = freq.get(c);
         huffmanNode.left = null;
         huffmanNode.right = null;
         pQ.add(huffmanNode);
      }

      while (pQ.size() > 1) {

         HuffmanNode x = pQ.peek();
         pQ.poll();

         HuffmanNode y = pQ.peek();
         pQ.poll();

         HuffmanNode total = new HuffmanNode();

         total.frequency = x.frequency + y.frequency;
         total.data = '-';

         total.left = x;

         total.right = y;
         root = total;

         pQ.add(total);
      }

      return pQ.poll();
   }


   public static void encodingEach(HuffmanNode node, StringBuilder prefix) {

      if (node != null) {
         if (node.left == null && node.right == null) {
            EncodedLetterList.put(node.data, prefix.toString());

         } else {
            prefix.append('0');

            encodingEach(node.left, prefix);
            prefix.deleteCharAt(prefix.length() - 1);

            prefix.append('1');
            encodingEach(node.right, prefix);
            prefix.deleteCharAt(prefix.length() - 1);
         }
      }

   }

//encoding
   public static String encode(String test) {
      Map<Character, Integer> freq = new HashMap<>();
      for (int i = 0; i < test.length(); i++) {
         if (!freq.containsKey(test.charAt(i))) {
            freq.put(test.charAt(i), 0);
         }
         freq.put(test.charAt(i), freq.get(test.charAt(i)) + 1);
      }

      System.out.println("Character Frequency Map = " + freq);
      root = buildTree(freq);

      encodingEach(root, new StringBuilder());
      System.out.println("Encoded letter lists = " + EncodedLetterList);
      StringBuilder s = new StringBuilder();

      for (int i = 0; i < test.length(); i++) {
         char c = test.charAt(i);
         s.append(EncodedLetterList.get(c));
      }

      return s.toString();
   }

//decoding
   public static void decode(String s) {

      StringBuilder stringBuilder = new StringBuilder();

      HuffmanNode temp = root;

      System.out.println("Encoded: " + s);

      for (int i = 0; i < s.length(); i++) {
         int j = Integer.parseInt(String.valueOf(s.charAt(i)));

         if (j == 0) {
            temp = temp.left;
            if (temp.left == null && temp.right == null) {
               stringBuilder.append(temp.data);
               temp = root;
            }
         }
         if (j == 1) {
            temp = temp.right;
            if (temp.left == null && temp.right == null) {
               stringBuilder.append(temp.data);
               temp = root;
            }
         }
      }

      System.out.println("Decoded string is " + stringBuilder.toString());

   }

}

class HuffmanNode implements Comparable<HuffmanNode> {
   int frequency;
   char data;
   HuffmanNode left, right;

   public int compareTo(HuffmanNode node) {
      return frequency - node.frequency;
   }
}
