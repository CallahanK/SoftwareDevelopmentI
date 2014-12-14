
/**
 * ArrayName Tester
 * 
 * @author (Kevin Callahan) 
 * @version (12/20/10)
 */

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class ArrayListNameTester
{
    public static void main (String[] args)
    {
        int length = Integer.parseInt(JOptionPane.showInputDialog("How many names?"));
        ArrayList<String> test = new ArrayList<String>();
        
        for (int name = 0; name < length; name++)
        {
            test.add(JOptionPane.showInputDialog("Input name"));
        }
        
        int swapA = Integer.parseInt(JOptionPane.showInputDialog("Which name do you what to swap?"))-1;
        int swapB = Integer.parseInt(JOptionPane.showInputDialog("Which name do you want to swap?"))-1;
        
        String tempA = test.get(swapA);
        String tempB = test.get(swapB);
        
        test.set(swapA, tempB);
        test.set(swapB, tempA);
        
        int removeName = Integer.parseInt(JOptionPane.showInputDialog("Which name do you want to remove?"))-1;
        test.remove(removeName);
        
        for(String temp:test)
        System.out.println(temp);
        
    }
}
