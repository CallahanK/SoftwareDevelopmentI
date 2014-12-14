
/**
 * Soda Can Consructor
 * 
 * @author (Kevin Callahan) 
 * @version (10/31/10)
 */


public class SodaCan
{
    
    public SodaCan()
    {
        height=0;
        radius=0;
        
    }

    public SodaCan(double initialHeight, double initialDiameter)
    {
        height=initialHeight;
        radius=0.5*initialDiameter;
    }
    
    public double getVolume()
    {
        volume=Math.PI*(Math.pow(radius,2.0))*height;
        return volume;
    }
    
    public double getSurfaceArea()
    {
        surfaceArea=(Math.PI*(Math.pow(radius,2.0)))+(Math.PI*(Math.pow(radius,2.0)))+(2.0*Math.PI*radius*height);
        return surfaceArea;
    }
    

    private double height; 
    private double radius; 
    private double volume;
    private double surfaceArea;
}
