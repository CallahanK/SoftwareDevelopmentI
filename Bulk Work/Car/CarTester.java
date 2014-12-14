
/**
 * Excercise P3.6
 * 
 * @author (Kevin Callahan) 
 * @version (10/17/10)
 */

public class CarTester
{
    public static void main (String[] args)
    {
        Car myHybrid = new Car(49,20);
        myHybrid.drive(100);
        System.out.println("There is " + myHybrid.getGas() + " gallons of fuel left.");
    }
}