package sorter;

import java.util.Random;

public class MergeSort
{
   public MergeSort(int[] anArray)
   {
      a = anArray;
   }
   
   public void sort()
   {  
      if (a.length <= 1) return;
      int[] first = new int[a.length / 2];
      int[] second = new int[a.length - first.length];
      System.arraycopy(a, 0, first, 0, first.length);
      System.arraycopy(a, first.length, second, 0, second.length);
      MergeSort firstSorter = new MergeSort(first);
      MergeSort secondSorter = new MergeSort(second);
      firstSorter.sort();
      secondSorter.sort();
      merge(first, second);
   }

   private void merge(int[] first, int[] second)
   {        
      int postFirst = 0;
      int postSecond = 0;
      int k = 0; 
 
      while (postFirst < first.length && postSecond < second.length)
      {  
         if (first[postFirst] < second[postSecond])
         {  
            a[k] = first[postFirst];
            postFirst++;
         }
         else
         {  
            a[k] = second[postSecond];
            postSecond++;
         }
         k++;
      }

      System.arraycopy(first, postFirst, a, k, first.length - postFirst);
      
      System.arraycopy(second, postSecond, a, k, second.length - postSecond);
   }

   public static int[] randomIntArray(int length, int n)
   {
     int[] a = new int[length];
     Random generator = new Random();
     for (int i = 0; i < a.length; i++)
     {
         a[i] = generator.nextInt(n);
     }
     return a;
   }

   
   private int[] a;
}

