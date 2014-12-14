/**
 * Excercise P2.7
 * 
 * @author (Kevin Callahan) 
 * @version (10/1/10)
 */
import java.util.Random;

public class RandomTester
{
    public static void main (String[] args)
    {
        
        Random generator = new Random();
        int dice = generator.nextInt(6);
        System.out.println("You rolled a " + dice + ".");
    }
}