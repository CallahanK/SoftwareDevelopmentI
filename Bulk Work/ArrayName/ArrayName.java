
/**
 * Array Name Constructor
 * 
 * @author (Kevin Callahan) 
 * @version (12/14/10)
 */

import javax.swing.JOptionPane;

public class ArrayName
{

    String[] nameArray;

    public ArrayName(int lenght)
    {
        nameArray = new String[lenght]; 
    }
        
    public void fillArray()
    {
        for (int name = 0; name < nameArray.length; name++)
        {
            nameArray[name]=JOptionPane.showInputDialog("Input name");
        }
    }
    
    public void printArray()
    {
        for(int name = 0; name < nameArray.length; name++)
            System.out.println(nameArray[name]);
    }
    
    public void printArrayBack()
    {
        for(int name = nameArray.length-1; name >= 0; name--)
        System.out.println(nameArray[name]);
    }
    
    
}



