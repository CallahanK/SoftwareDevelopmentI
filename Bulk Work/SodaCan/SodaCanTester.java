
/**
 * Exercise 4.9
 * 
 * @author (Kevin Callahan) 
 * @version (10/31/10)
 */
public class SodaCanTester
{
    
    public static void main(String[] args)
    {
        SodaCan can = new  SodaCan(12,8);
        
        System.out.printf("Volume=%5.2f%n",can.getVolume());
        System.out.printf("Surface Area=%5.2f%n",can.getSurfaceArea());
    }

    
}
