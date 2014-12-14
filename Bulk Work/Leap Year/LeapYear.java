
/**
 * LeapYear Constructor
 * 
 * @author (Kevin Callahan) 
 * @version (11/11/10)
 */

import javax.swing.JOptionPane;

public class LeapYear
{
    
    public LeapYear()
    {
        String tempYear = JOptionPane.showInputDialog("Input year to be checked");
        year = Integer.parseInt(tempYear);
    }
    
    public boolean isLeapYear()
    {
        boolean yearTest;
        
        if (year%4==0)
            yearTest=true;
        else
        yearTest=false;     
            if (year%100==0) 
                yearTest=false;
                if (year%400==0)
                    yearTest=true;      
        return yearTest;
    }
    
    private int year;
}
