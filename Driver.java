import java.util.*;
import java.io.*;
import java.lang.*;

public class Driver 
{

public static void main(String args[]) 
   {         
   //Data Fields and Initializations
   Scanner in=new Scanner(System.in);
   System.out.println("Enter Array Size: ");
   int size = in.nextInt();
   Integer[] items = new Integer[size];
   Integer[] copy = new Integer[size];
   
   //random int generator to fill user selected arraysize
   Random Int = new Random();
   
   //filling the array with random integers
   for(int i = 0; i < items.length; i++)
   {
      items[i] = Int.nextInt();
      copy[i] = items[i];
   }//end for
   
   //Utility sort built into java API
   long startTime = System.currentTimeMillis();
   Arrays.sort(items);
   System.out.println(" Sort time is: " + (System.currentTimeMillis() - startTime) + "ms");
   
   //Test Selection Sort
   for (int i = 0; i < items.length; i++)
   {
      items[i] = copy[i];
   }//end for
   
   startTime = System.currentTimeMillis();
   SelectionSort.sort(items);
   System.out.println("SelectionSort time is " + (System.currentTimeMillis() - startTime) + " ms" );
   
   
   //Test Bubble Sort
   for (int i = 0; i < items.length; i++)
   {
      items[i] = copy[i];
   }//end for
   
   startTime = System.currentTimeMillis();
   BubbleSort.sort(items);
   System.out.println("BubbleSort time is " + (System.currentTimeMillis() - startTime) + " ms" );
   
   //Test Insertion Sort
   for (int i = 0; i < items.length; i++)
   {
      items[i] = copy[i];
   }//end for
   startTime = System.currentTimeMillis();
   InsertionSort.sort(items);
   System.out.println("InsertionSort time is " + (System.currentTimeMillis() - startTime) + "ms" );
   
   
   //Test Merge Sort
   for (int i = 0; i < items.length; i++)
   {
      items[i] = copy[i];
   }//end for
   
   startTime = System.currentTimeMillis();
   MergeSort.sort(items);
   System.out.println("MergeSort time is " + (System.currentTimeMillis() - startTime) + "ms" );
   
   //Test Heap Sort
   for (int i = 0; i < items.length; i++)
   {
      items[i] = copy[i];
   }//end for
   
   startTime = System.currentTimeMillis();
   HeapSort.sort(items);
   System.out.println("HeapSort time is " + (System.currentTimeMillis() - startTime) + "ms" );
   }
}
    
     
          