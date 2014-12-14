import javax.swing.JOptionPane;
import java.util.*;
import java.text.*;
import java.util.Arrays;

public class GridFit
{
    //for (Array grid: e){
        public static void main (String[] args)
        {
        
            boolean[] grid = new boolean[25];
            java.util.Arrays.fill(grid,true);
            String input = JOptionPane.showInputDialog("Input filled spaces");
            StringTokenizer st = new StringTokenizer(input, ", ");
        
            int spaceFilled=0;
            while (st.hasMoreTokens()) {
                spaceFilled=Integer.parseInt(st.nextToken());
                
                grid[spaceFilled-1]=false;
            }
        
            for (int k=0; k<5; k++){
                String input2 = JOptionPane.showInputDialog("Input pattern type");
                
                if (Integer.parseInt(input2)==1){
                    int match = -1;
                    for (int i=0; i<=24; i++){
                        System.out.println(i);
                        if (grid[i]){
                            match = i++;
                            System.out.println("match1");
                            break;
                        }
                    }
                    
                    if (match== -1){
                        System.out.println("NONE");
                    }
                    else{
                        System.out.println(match);
                    }
                }
            }
        }
           /*
            public static  int pattern1(boolean[] grid){
                int match = -1;
                for (int i=0; i<25; i++){
                    if (grid[i]){
                        match = i++;
                        break;
                    }
                }
                return match;
            }
        
            public int pattern2(boolean[] grid){
                int match = -1;
                for (int i=0; i<25; i++){
                    if (grid[i]  && grid[i+5] && i<20){
                        match = i++;
                    }
                }
                return match;
            }
        
            public int pattern3(boolean[] grid){
                int match = -1;
                for (int i=0; i<25; i++){
                    if (grid[i] && grid[i+1] && i!=24){
                        match = i++;
                    }
                }
                return match;
            }
        
            public int pattern4(boolean[] grid){
                int match = -1;
                for (int i=0; i<25; i++){
                    if (grid[i] && grid[i+5] && grid[i+6] && i<19){
                        match = i++;
                    }
                }
                return match;
            }
        
            public int pattern5(boolean[] grid){
                int match = -1;
                for (int i=0; i<25; i++){
                    if (grid[i] && grid[i+1] && grid[i+5] && i<19){
                        match = i++;
                    }
                }
                return match;
            }
           */
}
