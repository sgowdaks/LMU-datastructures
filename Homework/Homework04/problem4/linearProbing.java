import java.util.*;
public class linearProbing{

  public static void scanForElements(ArrayList<Integer> arrli, int arraySize){
       char ch;
       do{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter The array Size");
            System.out.println("\nHash Table Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. get");
            System.out.println("3. delete");
            int k = 0;
            int key = 0;
            int choice = scan.nextInt();
            switch (choice) {
            case 1:

                System.out.println("Enter the key");
                key = scan.nextInt();
                int l = 0;
                k = hashFunc(key,arraySize);
                //System.out.println(k);
                if(arrli.get(k) == 0){
                   arrli.add(k,key);
                   //System.out.println("#");
                }else{
                    l = k;
                    k = k + 1;
                    while(k < arraySize && arrli.get(k) != 0 ){
                        k = k+1;
                        //System.out.println("Hello");
                    }
                    if(k >= arraySize){
                        k = 0;
                        while(k < l && arrli.get(k) != 0 ){
                        k = k+1;
                        }
                        if(k > l){
                           System.out.println("No index is leftout");
                        }else{
                           arrli.add(k,key);
                        }
                    }else{
                        arrli.add(k,key);
                    }
                }
                System.out.println(k);
                break;

            case 2:
                System.out.println("Enter key");
                key = scan.nextInt();
                //System.out.println(key);
                int f = hashFunc(key,arraySize);
                int index = search(f,arrli,key,arraySize);
                if(index != -1 ){
                    if(arrli.get(index) == 0){
                        System.out.println("No such item exists");
                    }else{
                    System.out.println("The index is:");
                    System.out.println(index);
                    }
                }
                //System.out.println(index);
                //System.out.println(arrli.get(12));

                break;
                
            case 3:
                System.out.println("Enter the key to be deleted");
                key = scan.nextInt();
                int z = hashFunc(key,arraySize);
                int ind = search(z,arrli,key,arraySize);
                if(arrli.get(ind) == 0){
                        System.out.println("It does not exists to delete");
                }else{
                if(ind != -1){
                    arrli.set(ind, 0);
                    System.out.println("deleted");
                }else{
                    System.out.println("Sorry! try to provide the right key");
                }
                }
                break;
                
            default:
                System.out.println("Wrong Entry \n ");
                break;
            }



            System.out.println(
                "\nDo you want to continue (Type y or n) \n");


            ch = scan.next().charAt(0);
       }while(ch == 'Y' || ch == 'y');

   }

   public static int search(int f, ArrayList<Integer> arrli, int key, int arraySize){
        if(arrli.get(f) == key ){
            //System.out.println("hello");
            //System.out.println(f);
            return f;
        }else{
            int l = f;
            f = f + 1;
            while(f < arraySize && arrli.get(f) != key ){
                f = f+1;
            }
            if(f >= arraySize){
                f = 0;
                while(f < l && arrli.get(f) != key ){
                    f = f+1;
                  }
                  if(f > l){
                        System.out.println("wrong key value");
                        return -1;
                    }else{
                         return f;
                    }
                }else{
                    return f;
                }
            }
   }

    public static int hashFunc(int key, int arraySize){

        int keyLength = Length(key);
        int arraySizeLength = Length(arraySize);
        String Stringkey = Integer.toString(key);
        int groupSum = 0;
        int i;
        for(i = 0; i < Stringkey.length(); i += arraySizeLength){
          if(i+arraySizeLength < Stringkey.length()){
            String st = Stringkey.substring(i, i+arraySizeLength);
            //System.out.println(st);
            groupSum += Integer.parseInt(st);
          }
        }
        if((keyLength % arraySizeLength) != 0){
          String st = Stringkey.substring(i-arraySizeLength , Stringkey.length());
          //System.out.println("hello");
          groupSum += Integer.parseInt(st);
        }
        //System.out.println(groupSum);
        return groupSum % arraySize;
    }

    public static int Length(int value){
        int count = 1;
        while(value > 9){
          value = value / 10;
          count = count +1 ;
        }
        //System.out.println(count);
        return count;
      }
}
