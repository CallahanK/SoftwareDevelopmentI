
/**
 * Exercise P6.12
 * 
 * @author (Kevin Callahan) 
 * @version (11/12/10)
 */

import javax.swing.JOptionPane;

public class LeapYearTester
{
    public static void main(String[] args)
    {
        LeapYear year = new LeapYear();
        
        if (year.isLeapYear())
            JOptionPane.showMessageDialog(null,"It is a leap year");
            else
            JOptionPane.showMessageDialog(null,"It is not a leap year");
    }
    
}