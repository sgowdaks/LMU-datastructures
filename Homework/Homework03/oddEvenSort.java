public class oddEvenSort
{
    void oddEvenSort(int arr[])
    {
        int n = arr.length;
        int b = 0;
        int c = 0;
        
    //odds first
        for (int i = 0; i < n-1; i++){
            
            for (int j = 0; j < n-i-1; j++){
                
                b = j;
                
                while (arr[b] % 2 != 1) 
                {
                    if (n > b){
                        b++;
                    } else {
                        break;
                    }
                }
                
                c = b + 1;
                
                if (n - 1 > c){
                    
                    while (arr[c] % 2 != 1) 
                    {
                        if ( n > c){
                            
                            c++;
                            
                        } else {
                            
                            break;
                            
                        }
                    }
                    
                    if (arr[c] > arr[b]){
                        // swap arr[j+1] and arr[j]
                        int temp = arr[c];
                        arr[c] = arr[b];
                           arr[b] = temp;
                    }
                }
            }
            
        }
        
    //Now Evens
        for (int i = 0; i < n-1; i++){
            
            for (int j = 0; j < n-i-1; j++) {
                
                b = j;
                
                while (arr[b] % 2 != 0) 
                {
                    if (n > b){
                        b++;
                    }else {
                        break;
                    }
                }
                
                c = b + 1;
                
                if (n - 1 > c){
                    while (arr[c] % 2 != 0) 
                    {
                        if (n > c){
                            c++;
                        } else {
                            break;
                        }
                    }
                    
                    if (arr[c] > arr[b]){
                        // swap arr[j+1] and arr[j]
                        int temp = arr[c];
                        arr[c] = arr[b];
                           arr[b] = temp;
                    }
                }
            }
        }
    }
 
    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " ");
        System.out.println();
        
    }
 
    // Driver method to test above
    public static void main(String args[])
    {
        oddEvenSort ob = new oddEvenSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.oddEvenSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
