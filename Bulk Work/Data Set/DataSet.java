
/**
 * Data Set Constructor
 * 
 * @author (Kevin Callahan) 
 * @version (10/30/10)
 */

import java.util.Arrays;

public class DataSet
{

    public DataSet()
    {
       counter=0;
       dataSet[0]=0;
       dataSet[1]=0;
       dataSet[2]=0;
       dataSet[3]=0;
    }

    public void addValue(int x)
    {
        dataSet[counter]=x;
        
        counter ++;
        
    }
    
    public int getSmallest()
    {
        Arrays.sort(dataSet);
        return dataSet[0];
    }
    
    public int getLargest()
    {
        Arrays.sort(dataSet);
        return dataSet[3];
    }
    
   private int[] dataSet= new int[4]; 
   private int counter;
}
