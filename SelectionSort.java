import java.util.*;
import java.io.*;
import java.lang.*;

public class SelectionSort 
{
   
   //Sorts the array using selection sort algorithm
   public static void sort(Comparable[] table)
   {
      int n= table.length;
      
      //fills the table with values
      for (int fill = 0; fill < n-1; fill++)
      {
         int posMin=fill;
         
         //compares values till theyre sorted
         for  (int next = fill + 1; next < n; next++)
         {
            if (table[next].compareTo(table[posMin]) < 0) 
            {
               posMin = next;
            }
         }//
         
         Comparable temp = table[fill];
         table[fill] = table[posMin];
         table[posMin] = temp;
      }//end for
   }//end sort
 
}//end insertion sort 
