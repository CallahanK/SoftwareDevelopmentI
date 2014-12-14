
/**
 * Programming Project 1.1
 * 
 * @author (Kevin Callahan) 
 * @version (9/21/10)
 */
import javax.swing.JOptionPane;

public class InputDialog
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("What is your name?");
        String verb = JOptionPane.showInputDialog("What would you like me to do?");
        JOptionPane.showMessageDialog(null,"I'm sorry "  + name + ". I'm afraid I can't " + verb + ".");
    }
}