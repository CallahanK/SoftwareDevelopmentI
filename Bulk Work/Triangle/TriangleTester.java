
/**
 * Project 4.1
 * 
 * @author (Kevin Callahan) 
 * @version (11/3/10)
 */

import javax.swing.JTable;
import javax.swing.JFrame;
import javax.swing.JButton;

public class TriangleTester
{
    
    public static void main(String[] args)
    {
        
            Triangle tri = new Triangle(2,2,4,2,3,4);
        
            String[] columnNames = {"","Sides","Angles","Area","Perimeter"};
            Object[][] data = {
                {"","Sides","Angles","Area","Perimeter"},
                {"A",tri.getSide("A"),tri.getAngle("A"),tri.area(),tri.perimeter()},
                {"B",tri.getSide("B"),tri.getAngle("B"),"",""},
                {"C",tri.getSide("C"),tri.getAngle("C"),"",""},
            };

        
        JTable table = new JTable(data, columnNames);
        JButton calculate = new JButton("Calculate");
        JFrame frame = new JFrame("Triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        frame.getContentPane().add(calculate);
        frame.getContentPane().add(table);
        frame.pack();
        frame.setVisible(true);



        
        
    }
}
