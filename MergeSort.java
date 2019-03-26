import java.util.*;
import java.io.*;
import java.lang.*;

public class MergeSort
{
   //separates the array into two and sorts them
   public static <T extends Comparable<T>> void sort(T[] table)
   {
      if (table.length > 1)
      {
         //recursive algorithm that copes the subtable and sorts them
         int halfSize = table.length / 2;
         T[] leftTable = (T[]) new Comparable[halfSize];
         T[] rightTable = (T[]) new Comparable[table.length - halfSize];
         System.arraycopy(table, 0, leftTable, 0, halfSize);
         System.arraycopy(table, halfSize, rightTable, 0, table.length - halfSize);
         
         sort(leftTable);
         sort(rightTable);
         
         //mrges the two sorted ones into one
         merge(table, leftTable, rightTable);
      }//end if
   }//end sort
   
   //merge method to take two arrays and combine into one
   private static <T extends Comparable<T>> void merge(T[] outputSequence, T[] leftSequence, T[] rightSequence)
   {
      int i = 0;
      int j = 0;
      int k = 0;
      
      //while there is data in both sequences
      while (i < leftSequence.length && j < rightSequence.length)
      {
         if (leftSequence[i].compareTo(rightSequence[j]) < 0 )
         {
            outputSequence[k++] = leftSequence[i++];
         } else  {
            outputSequence[k++] = rightSequence[j++];
         }//end elaeif
      }//end while
      
   //copy remaining input froml eft into output
   while (i < leftSequence.length)
   {
      outputSequence[k++] = leftSequence[i++];
   }//end while
   
   //copy remaining input from right into output
   while (j < rightSequence.length)
   {
      outputSequence[k++] = rightSequence[j++];
   }//end while
   
   }//end merge
   
}//end mergesort