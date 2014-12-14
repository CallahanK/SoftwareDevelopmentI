
/**
 * Exercise 1.8
 * 
 * @author (Kevin Callahan ) 
 * @version (9/21/10)
 */
import javax.swing.JOptionPane;

public class DialogTester
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("What is your name");
        System.out.print("Hello, ");
        System.out.println(name);
        System.exit(0);
    }
}
