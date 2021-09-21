package edu.lmu.cmsi2120.hw3;


public class IntList implements IntListInterface {
       private int[] theList;
       private int   size;

      private static final int STARTING_SIZE = 19;    // defines starting size; don't worry, we'll deal

      private class ListException extends Exception {
         public ListException( String m ) {
            super( m );
         }
      }

      public IntList() {                        // doesn't HAVE to be declared public, but doesn't hurt
         theList = new int[STARTING_SIZE];
         size = 0;
      }

      public int getValueAtIndex( int index ) {
         try {
            if( size == 0 ) {
               throw new ListException( "The list is empty!" );
            } else if( index > size ) {
               throw new ListException( "The index value is too large" );
            } else if( index < 0 ) {
               throw new ListException( "The index value is too small");
            }
         }
         catch( ListException le ) {}
         return theList[index];
      }

      public boolean append( int valueToAdd ) {
         if( size < theList.length ) {
            theList[size] = valueToAdd;
            size++;
            return true;
         } else {
            // what should we do here, if there's no room?
         }
         return false;
      }

      private void holeFiller( int index ) {
         for( int i = index; i < size - 1; i++ ) {
            theList[i] = theList[i+1];
         }
         size--;
      }

      public int removeValueAtIndex( int index ) {
         int value = theList[index];
         try {
            if( size == 0 ) {
               throw new ListException( "The list is empty!" );
            } else if( index > size ) {
               throw new ListException( "The index value is too large" );
            } else if( index < 0 ) {
               throw new ListException( "The index value is too small");
            }
         }
         catch( ListException le ) {}
         holeFiller( index );
         return value;
      }

      // we've gotta have this to actually get things to compile
      public boolean insertValueAtIndex( int value, int index ) {
		try {
            if( size == 0 ) {
               throw new ListException( "The list is empty!" );
            } else if( index > size ) {
               throw new ListException( "The index value is too large" );
            } else if( index < 0 ) {
               throw new ListException( "The index value is too small");
            }
         }
        catch( ListException le ) {}
		int[] arr = new int[STARTING_SIZE];
		for(int i = 0;i<theList.length;i++){
		  arr[i] = theList[i];
      //System.out.println(arr[i]);
		}
		theList[index] = value;
    //System.out.println(index);
    //int i = index+1;
    //while(i)
    index = index + 1;
		for(int i = index;i<theList.length-1;i++){
			theList[i] = arr[i-1];
      //System.out.println(theList[i]);
      //System.out.println(theList[i-1]);
		}


        return true;
      }


}
