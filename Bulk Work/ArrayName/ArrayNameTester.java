
/**
 * ArrayName Tester
 * 
 * @author (Kevin Callahan) 
 * @version (12/14/10)
 */

import javax.swing.JOptionPane;
public class ArrayNameTester
{
    public static void main (String[] args)
    {
        int lenght = Integer.parseInt(JOptionPane.showInputDialog("How many names?"));
        ArrayName test = new ArrayName(lenght);
        test.fillArray();
        test.printArray();
        test.printArrayBack();
        
        
    }
}
