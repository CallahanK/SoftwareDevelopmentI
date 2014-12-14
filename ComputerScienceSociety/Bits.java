
/**
 * @author (Kevin Callahan)
*/
import javax.swing.JOptionPane;
import java.util.*;
import java.text.*;
public class Bits
{
    public static void main (String[] args)
    {
        for(int trials=1;trials<6;trials++){
        
        String format="";
        int numberOf=0;
        String bit1="";
        String bit2="";
        String bit3="";
        String bit4="";
        
        int position=0;
        
        String input = JOptionPane.showInputDialog("Input data");
        StringTokenizer st = new StringTokenizer(input, ", ");
        
        
        format=st.nextToken();
        numberOf=Integer.parseInt(st.nextToken());
        bit1=st.nextToken();
        bit2=st.nextToken();
        if (numberOf == 3){
            bit3=st.nextToken();
        }
       
        if (numberOf == 4){
            bit4=st.nextToken();
        }
        
        String comparer1=bit1;
        String comparer2=bit2;
        String comparer3=bit3;
        String comparer4=bit4;
        
        
       
        while(format.contains("*")){
            for (int i = 0; i<format.length(); i++){
                String temp = format.substring(i,i+1);
                //System.out.println(temp);
                if (temp.equals("*")){
                position=i;
                }
            }
      
            format=format.substring(0,position)+format.substring(position+1,format.length());
        
            comparer1=comparer1.substring(0,position)+comparer1.substring(position+1,comparer1.length());
            comparer2=comparer2.substring(0,position)+comparer2.substring(position+1,comparer2.length());
            if (numberOf == 3){
            comparer3=comparer3.substring(0,position)+comparer3.substring(position+1,comparer3.length());
            }
            if (numberOf == 4){
            comparer4=comparer4.substring(0,position)+comparer4.substring(position+1,comparer4.length());
            }
        }
        
        String results="";
        results = results + trials + ".  ";
         
        if (comparer1.equals(format))
        results = results + bit1 + "  ";
        
        if (comparer2.equals(format))
        results = results + bit2 + "  ";
        
        if (comparer3.equals(format) && numberOf == 3)
        results = results + bit3 + "  ";
        
        if (comparer4.equals(format) && numberOf == 4)
        results = results + bit4 + "  ";
        
        if (!comparer1.equals(format) && !comparer2.equals(format) && !comparer3.equals(format) && !comparer4.equals(format))
        results = results + "NONE";
        
        System.out.println(results);
        
        }
    }
}
