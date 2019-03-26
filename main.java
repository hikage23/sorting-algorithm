public static void main(String args[]) 
{         
   int size = Integer.parseInt(JOptionPane.showInputDialog("Enter Array Size: "));
   Integer[] items = new Integer[size];
   Integer[] copy = new Integer[size];
   Random rInt = new Random();
   
   for(int i = 0; i < items.length; i++)
   {
      items[i] = rInt.nextInt();
      copy[i] = items[i];
   }//end for
   
   long startTime = System.currentTimeMillis();
   Arrays.sort(items);
   System.out.println("Sort time is: " + (System.currentTimeMillis() - startTime) + "ms");
   
   //JOptionPane.showMessageDialog(null, "Utility sort succesful (true/false): " + verify(items));
   
   for (int i = 0; i < items.length; i++)
   {
      items[i] = copy[i];
   }//end for
   
   startTime = System.currentTimeMillis();
   QuickSort.sort(items);
   System.out.println("QuickSort time is " + (System.currentTimeMillis() - startTime) + "ms" );
   
   //JOptionPane.showMessageDialog(null, Quicksort succesful (tr
}
    
     
          