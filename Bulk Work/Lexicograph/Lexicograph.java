
/**
 * Lexicograph Constructor
 * 
 * @author (Kevin Callahan) 
 * @version (11/5/10)
 */

import java.util.Arrays;
public class Lexicograph
{
    
    public Lexicograph()
    {
       counter=0;
       wordSet[0]=null;
       wordSet[1]=null;
       wordSet[2]=null;
       wordSet[3]=null;
    }

    public void addWord(String x)
    {
        wordSet[counter]=x;
        counter ++;
        
    }
    
    public String getSmallest()
    {
        Arrays.sort(wordSet);
        return wordSet[0];  
    }
    
    public String getLargest()
    {
        Arrays.sort(wordSet);
        return wordSet[3];
    }
    
    private String[] wordSet= new String[4]; 
    private int counter;
}
