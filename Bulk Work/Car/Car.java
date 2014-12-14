
/**
 * Car Constructor
 * 
 * @author (Kevin Callahan) 
 * @version (10/17/10)
 */



public class Car
{
    public Car()
    {
        car=0;
        gas=0;
    }
    
    public Car(double initialCar, double interestGas)
    {
        car=initialCar;
        gas=interestGas;
    }

    public void drive(double distance)
    {
        gas=gas-(distance/car);
       
    }
    
    public void addGas(double moregas)
    {
        gas=gas + moregas;
        
    }
    
    public double getGas()
    {
        return gas;
    }
    
    
    private double car;
    private double gas;

}
