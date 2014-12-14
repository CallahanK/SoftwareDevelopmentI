/**
 * Excercise P2.4
 * 
 * @author (Kevin Callahan) 
 * @version (9/30/10)
 */
import java.awt.Rectangle;

public class RectangleIntersect
{
    public static void main (String[] args)
    {
        Rectangle rOne = new Rectangle (0,0,15,10);
        Rectangle rTwo = new Rectangle (7,8,10,15);
        System.out.println(rOne);
        System.out.println(rTwo);
        Rectangle rThree = rOne.intersection(rTwo);
        System.out.println(rThree);
        
    }
}