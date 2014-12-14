package sorter;


public class MergeSortTester
{  	
   public static void main(String[] args)
   {  
	  System.out.println("Sort Start");
	  int[] x = MergeSort.randomIntArray(20, 100);
      for(int k: x)
      System.out.println(k);
      MergeSort sorter = new MergeSort(x);
      sorter.sort();
      System.out.println("Sorting Complete");
      for(int i: x)
      System.out.println(i);
   }
}


