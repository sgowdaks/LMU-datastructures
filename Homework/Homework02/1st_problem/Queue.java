//package hw2;



class Queue
{
private int maxSize;
private long[] queArray;
private int front;
private int rear;
private int nItems;
//--------------------------------------------------------------
public Queue(int s) // constructor
{
maxSize = s;
queArray = new long[maxSize];
front = 0;
rear = -1;
nItems = 0;
}
//--------------------------------------------------------------
public void insert(long j) // put item at rear of queue
{
if(maxSize < nItems + 1){
  System.out.println("You are trying to insert more elements than its max size");
  return ;
}
if(rear == maxSize-1) // deal with wraparound
rear = -1;
queArray[++rear] = j; // increment rear and insert
nItems++; // one more item
}
//--------------------------------------------------------------
public long remove() // take item from front of queue
{
long temp =  queArray[front++]; // get value and incr front
if(front == maxSize) // deal with wraparound
front = 0;
nItems--; // one less item
return temp;
}; // get value and incr front

//--------------------------------------------------------------
public long peekFront() // peek at front of queue
{
  return queArray[front];
}
//--------------------------------------------------------------
public boolean isEmpty() // true if queue is empty
{
return (nItems==0);
}
//--------------------------------------------------------------
public boolean isFull() // true if queue is full
{
return (nItems==maxSize);
}
//--------------------------------------------------------------
public int size() // number of items in queue
{
return nItems;
}
//--------------------------------------------------------------
public void display(){
  System.out.println("First Inserted Item to the Last Inserted Item");
  int nnItems = nItems;
  if( isEmpty()){
    System.out.println("Queue Is Empty");
  }else{

      if(front == 0){
        //int nnitems = nItems;
        for(int j = 0;j<nItems;j++){
          System.out.println(queArray[j]);
          nnItems = nnItems - 1;
        }
      }else{
        //int newFront = front;
        //int nnitems = nItems;
        for(int j = front;j<nItems;j++){
          System.out.println(queArray[j]);
          nnItems = nnItems - 1;
        }
        if(nnItems != 0){
          int i = 0;
          while(nnItems >= 1){
            System.out.println(queArray[i]);
            i = i+1;
            nnItems = nnItems - 1 ;

          }
        }
      }



}
//---------------------------------------------------------------
}
} // end class Queue
