
/**
 * Triangle Construtor
 * 
 * @author (Kevin Callahan) 
 * @version (11/1/10)
 */


public class Triangle
{
    
    public Triangle()
    {
        ax=0;
        ay=0;
        bx=0;
        by=0;
        cx=0;
        cy=0;
    }
    
    public Triangle(double initialax,double initialay,double initialbx,double initialby,double initialcx,double initialcy)
    {
        ax=initialax;
        ay=initialay;
        bx=initialbx;
        by=initialby;
        cx=initialcx;
        cy=initialcy;
    }

    public double getSide(String side)
    {
        
        double sideTemp;
        
        if (side=="C")
        {
            sideC=Math.sqrt(Math.pow((ax-bx),2.0)+Math.pow((ay-by),2.0));
            sideTemp=sideC;
        }
        
        
        else if (side=="B")
        {
            sideB=Math.sqrt(Math.pow((cx-bx),2.0)+Math.pow((cy-by),2.0));
            sideTemp= sideB;
        }
        
        
        else if (side=="A")
        {
            sideA=Math.sqrt(Math.pow((cx-bx),2.0)+Math.pow((cy-by),2.0));
            sideTemp= sideA;
        }
        
        else
        {
            sideTemp=0.0;
        }
        
        return sideTemp;
    }
    
    public double getAngle(String angle)
    {
        double angleTemp;
        
        if (angle=="C")
        {
            angleC=Math.acos((Math.pow(getSide("C"),2.0)-Math.pow(getSide("A"),2.0)-Math.pow(getSide("B"),2.0))/(2*getSide("A")*getSide("B")));
            angleTemp=angleC;
        }
        
        
        else if (angle=="B")
        {
            angleB=Math.acos((Math.pow(getSide("B"),2.0)-Math.pow(getSide("A"),2.0)-Math.pow(getSide("C"),2.0))/(2*getSide("A")*getSide("C")));
            angleTemp=angleB;
        }
        
        
        else if (angle=="A")
        {
            angleA=Math.acos((Math.pow(getSide("A"),2.0)-Math.pow(getSide("B"),2.0)-Math.pow(getSide("C"),2.0))/(2*getSide("B")*getSide("C")));
            angleTemp=angleA;
        }
        
        else
        {
            angleTemp=0.0;
        }
        
        return angleTemp;
    }
    
    public double perimeter()
    {
        return getSide("A")+getSide("B")+getSide("C");
    }
    
    public double area()
    {
        return 0.5*getSide("A")*getSide("B")*Math.sin(getAngle("C"));
    }
    
    
    
    
    
    private double sideA;
    private double sideB;
    private double sideC;
    
    private double angleA;
    private double angleB;
    private double angleC;
    
    private double ax;
    private double ay;
    private double bx;
    private double by;
    private double cx;
    private double cy;
}
