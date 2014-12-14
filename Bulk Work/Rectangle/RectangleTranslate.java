/**
 * Excercise P2.3
 * 
 * @author (Kevin Callahan) 
 * @version (9/30/10)
 */
import java.awt.Rectangle;

public class RectangleTranslate
{
    public static void main (String[] args)
    {
        Rectangle rOne = new Rectangle (0,0,5,5);
        System.out.println(rOne);
        rOne.translate(5,0);
        System.out.println(rOne);
        rOne.translate(0,5);
        System.out.println(rOne);
        rOne.translate(-5,0);
        System.out.println(rOne);
    }
}