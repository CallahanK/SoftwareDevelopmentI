
/**
 * Exercise P4.6
 * 
 * @author (Kevin Callahan) 
 * @version (10/30/10)
 */
public class DataSetTester
{
    public static void main(String[] args)
    {
        DataSet set = new DataSet();
        
        set.addValue(2);
        set.addValue(4);
        set.addValue(8);
        set.addValue(6);

        
        System.out.println("The large number is "+set.getLargest());
        System.out.println("The small number is "+set.getSmallest());
    }
    
}