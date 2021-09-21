package edu.lmu.cmsi2120.HomeWork3;
//import java.util.Arrays;

class HighArray
{
   private long[] a;
   private int nElems;

  public HighArray(int max)
  {
    a = new long[max];
    nElems = 0;
  }

  public boolean find(long searchKey)
  {
    int j;
    for(j=0; j<nElems; j++)
    if(a[j] == searchKey)
    break;
    if(j == nElems)
      return false;
    else
      return true;
  }

 public void insert(long value)
 {
   a[nElems] = value;
   nElems++;
 }

 public boolean delete(long value)
 {
   int j;
   for(j=0; j<nElems; j++)
   if( value == a[j] )
     break;
   if(j==nElems)
     return false;
   else
   {
     for(int k=j; k<nElems; k++)
      a[k] = a[k+1];
      nElems--;
    return true;
  }
 }

 public void display()
 {
 for(int j=0; j<nElems; j++)
 System.out.print(a[j] + " ");
 //System.out.println("");
 }

 public long getMax()
 {
   long max = -1;
   for(int i = 0;i<nElems;i++){
     if(a[i]>max){
       max = a[i];
     }
   }
   return max;
 }

 public void noDups() {
   //System.out.println(a[0]);
   //Arrays.sort(a);
   long tmp ;
   for(int i = 0;i<nElems;i++){
     for (int j = 1;j<nElems-i;j++){
       if(a[j-1]>a[j]){
         tmp = a[j];
         a[j] = a[j-1];
         a[j-1] = tmp;
       }
     }
   }

   long[] a1 = new long[a.length];
   a1[0] = a[0];

   int j = 0;
   for(int i = 1;i<a.length;i++){
     if(a1[j]!=a[i]){
       j = j+1;
       a1[j] = a[i];
     }
   }
    for(int i = 0;i<nElems;i++){
      a[i] = a1[i];
    }

 }


 }

