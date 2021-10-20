public class Deque
{
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int beginning;
    private int nItems;
    //--------------------------------------------------------------
    public Deque(int s) // constructor
    {
    maxSize = s;
    queArray = new long[maxSize];
    front = maxSize - 1;
    rear = -1;
    nItems = 0;
    beginning = 0;
    }
    //--------------------------------------------------------------
    public void insertLeft(long j) // put item at rear of deque
    {
    if(isFull()){
      System.out.println("You are trying to insert more elements than its max size");
      return ;
    }

    if(rear == maxSize-1){ // deal with wraparound
        rear = -1;
    }

    queArray[++rear] = j; // increment rear and insert
    nItems++; // one more item

    //System.out.println(j);

    //System.out.println(rear);

    }
    //--------------------------------------------------------------
    //***
    public void insertRight(long j)
    {

        int emptyIndex = -1;

        if(isFull()){

            System.out.println("You are trying to insert more elements than its max size");

            return ;

        }


        for (int i = maxSize - 1; i >= 0; i--){

            if (queArray[i] == 0) {

                for(int k = i; k < maxSize - 1; k++){

                    queArray[k] = queArray[k + 1];

                }

                queArray[front] = j;

                nItems++;

                break;

            }

        }


    }
    //--------------------------------------------------------------

    public void removeRight(){

       for (int i = front; i >= beginning; i--){

            if (queArray[i] == 0) {

                if (isEmpty()){

                   System.out.print("The Deque is currently empty");
                   break;

                } else {

                continue;

                }

            } else {

                queArray[i] = 0;
                nItems--;
                break;

                }
       }
    }

    //--------------------------------------------------------------
    public void removeLeft() // take item from front of deque
    {

    for (int i = beginning; i <= maxSize-1; i++){

            if (queArray[i] == 0) {

                if (isEmpty()){

                   System.out.print("The Deque is currently empty");
                   break;

                } else {

                continue;

                }

            } else {

                queArray[i] = 0;
                nItems--;
                break;
                }

    } // get value and incr front
    }

    //--------------------------------------------------------------
    public boolean isEmpty() // true if deque is empty
    {
    return (nItems==0);
    }
    //--------------------------------------------------------------
    public boolean isFull() // true if deque is full
    {
    return (nItems==maxSize);
    }
    //--------------------------------------------------------------
    public int size() // number of items in deque
    {
    return nItems;
    }
    //--------------------------------------------------------------
    public void display(){

      System.out.println("First Inserted Item to the Last Inserted Item");

      if( isEmpty()){

        System.out.println("Deque Is Empty");

      }else{

        for(int j = 0; j <= maxSize - 1; j++){

           if (queArray[j] == 0){

               continue;

           } else {

               System.out.println(queArray[j]);
           }

        }

      }

    }
  }
