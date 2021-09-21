package edu.lmu.cmsi2120.hw3;

public class ArraysIn{
public static void main( String[] args ) {
         IntList list = new IntList();
         list.append( 2 );
         list.append( 3 );
         list.append( 5 );
         list.append( 7 );
         System.out.println( list.getValueAtIndex( 3 ) );   // should return the value 7
         list.append( 11 );
         list.append( 13 );
         list.append( 17 );
         list.append( 19 );
         System.out.println( list.getValueAtIndex( 7 ) );      // should return the value 19
         System.out.println( list.removeValueAtIndex( 3 ) );   // should return the value 7
         System.out.println( list.getValueAtIndex( 3 ) );      // should return the value 11
         System.out.println( list.getValueAtIndex( 18 ) );     // just to see what happens
		     list.insertValueAtIndex( 10, 4 );
		     // System.out.println(list.getValueAtIndex( 0 ));
         // System.out.println(list.getValueAtIndex( 1 ));
         // System.out.println(list.getValueAtIndex( 2 ));
         // System.out.println(list.getValueAtIndex( 3 ));
         // System.out.println(list.getValueAtIndex( 4 ));
         // System.out.println(list.getValueAtIndex( 5 ));
         // System.out.println(list.getValueAtIndex( 6 ));
         // System.out.println(list.getValueAtIndex( 7 ));
         // System.out.println(list.getValueAtIndex( 8 ));
         // System.out.println(list.getValueAtIndex( 9 ));//


      }

}
