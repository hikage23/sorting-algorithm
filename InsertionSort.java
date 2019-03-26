import java.util.*;
import java.io.*;
import java.lang.*;

public class InsertionSort 
{
   //sorts the table using insertion sort
   public static <T extends Comparable<T>> void sort(T[] table)
   {
      for (int nextPos = 1; nextPos < table.length; nextPos++)
      {
         insert (table, nextPos);
      }//end for
   }//end static
   
   //inserts the new item in the array in the appropriate place
   private static <T extends Comparable<T>> void insert (T[] table, int nextPos)
   {
      T nextVal = table[nextPos];
      while (nextPos > 0 && nextVal.compareTo(table[nextPos - 1]) < 0)
      {
         table [nextPos] = table[nextPos - 1];
         nextPos--;
      }//end while
      table[nextPos] = nextVal;
   }//end private static

}//end InsertionSort