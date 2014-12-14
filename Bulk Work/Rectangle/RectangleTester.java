
/**
 * Excercise P2.1
 * 
 * @author (Kevin Callahan) 
 * @version (9/28/10)
 */
import java.awt.Rectangle;

public class RectangleTester
{
    public static void main (String[] args)
    {
        Rectangle rOne = new Rectangle (5,6,7,5);
        System.out.println("Area="+rOne.getWidth() * rOne.getHeight());
        double width1 = rOne.getWidth();
        double height1 = rOne.getHeight();
        System.out.println("Perimeter=" + (height1 + width1 + height1 + width1));
    }
}
        