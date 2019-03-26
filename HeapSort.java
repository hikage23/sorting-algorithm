import java.util.*;
import java.io.*;
import java.lang.*;

public class HeapSort {

   //implements the heapsort algorithm
   public static <T extends Comparable<T>> void sort(T[] table)
   {
      buildHeap(table);
      shrinkHeap(table);
   }//end sort
   
   //creates the heap thatll be sorted and put into the array
   private static <T extends Comparable<T>> void buildHeap(T[] table)
   {
      int n = 1;
      while (n < table.length)
      {
         n++;
         int child = n-1;
         int parent = (child - 1) / 2;
         while (parent >=0 && table[parent].compareTo(table[child]) < 0)
         {
            swap (table, parent, child);
            child = parent;
            parent = (child - 1) / 2;
         }//end while
      }//end while
   }//end buildHeap
   
   //takes the heap and shrinks it while reheapify into the array
   private static <T extends Comparable<T>> void shrinkHeap(T[] table)
   {
      int n = table.length;
      
      while (n > 0)
      {
         n--;
         swap(table, 0, n);
         int parent = 0;
         
         while (true) 
         {
            int leftChild = 2 * parent + 1;
            if (leftChild >= n )
            {
               break;
            }//end if
            
            int rightChild = leftChild + 1;
            
            int maxChild = leftChild;
            
            if (rightChild < n && table[leftChild].compareTo(table[rightChild]) < 0)
            {
               maxChild = rightChild;
            }//end if
            
            if (table[parent].compareTo(table[maxChild]) < 0)
            {
               swap(table, parent, maxChild);
               
               parent = maxChild;
            } else {
                  break;
                  }
         }//end while
      }//end while
   }//end shrinkHeap
   
   private static <T extends Comparable<T>> void swap(T[] table, int i, int j)
   {
      T temp = table[i];
      table[i] = table[j];
      table[j] = temp;
   }//end swap
}//end HeapSort