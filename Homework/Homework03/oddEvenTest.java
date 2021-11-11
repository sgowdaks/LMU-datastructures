class oddEvenTest
{
public static void main(String args[])
{
    oddEvenSort ob = new oddEvenSort();
    int arr[] = {64, 34, 25, 12, 22, 11, 90};
    ob.oddevenSort(arr);
    System.out.println("Sorted array");
    ob.printArray(arr);
}

}
