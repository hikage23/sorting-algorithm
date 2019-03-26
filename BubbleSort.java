import java.util.*;
import java.io.*;
import java.lang.*;

public class BubbleSort
{
   //Sorts the array using bubble sort algorithm
   public static <T extends Comparable<T>> void sort(T[] table)
   {
      int pass = 1;
      boolean exchanges = false;
      
      //Sinks the smallest values
      do {
         exchanges = false;
         for (int i =0; i < table.length - pass; i++)
         {
            if (table[i].compareTo(table[i + 1]) > 0 )
            {
               T temp = table[i];
               table[i] = table[i + 1];
               table[i + 1] = temp;
               exchanges = true;
            }//end if
         }//end for
         pass++;
      } while (exchanges);  
   }//end static
   
}//end bubble sort