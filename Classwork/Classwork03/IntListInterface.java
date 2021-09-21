package edu.lmu.cmsi2120.hw3;

public interface IntListInterface {
      int getValueAtIndex( int index );
      boolean append( int valueToAdd );
      boolean insertValueAtIndex( int value, int index );
      int removeValueAtIndex( int index );
    }
