
/**
 * @author (Kevin Callahan)
*/
import javax.swing.JOptionPane;
import java.util.*;
import java.text.*;
public class DraftPicks
{
    public static void main (String[] args)
    {
        double[] averageSal = new double[10];
        for(int i=0; i<=9; i++){
        double tempYears = Double.parseDouble(JOptionPane.showInputDialog("Input years"));
        double tempSalary = Double.parseDouble(JOptionPane.showInputDialog("Input salary"));
        averageSal[i] = tempSalary/tempYears;
        //System.out.println(averageSal[i]);
        }   
        
        DecimalFormat df = new DecimalFormat("#");
        
        //1
        double averageAnnualSal=0;
        for(double i:averageSal){
            averageAnnualSal = averageAnnualSal + i;
        }
        averageAnnualSal = averageAnnualSal*1000000;
        averageAnnualSal = averageAnnualSal/10;
        System.out.println("1. " + df.format(averageAnnualSal));
        
        //2
        int largestSalNum=0;
        for(int i=0;i<10;i++){
            for(int k=2;k<10;k++){
                 if(averageSal[i]>averageSal[largestSalNum]){
                    largestSalNum=i;
                }  
            }
        }
        System.out.println("2. " + df.format((averageSal[largestSalNum]*1000000)) + " by #" + (largestSalNum+1));
        
        
        //3
        double[] sixteenPerGame = new double[10];
        for(int i=0; i<=9; i++){
        sixteenPerGame[i] = (averageSal[i]*1000000)/16;
        //System.out.println(df.format(sixteenPerGame[i]));
        } 
        
        int largestRangeNum=0;
        int smallestRangeNum=0;
        for(int i=0;i<10;i++){
            for(int k=2;k<10;k++){
                 if(sixteenPerGame[i]>sixteenPerGame[largestRangeNum]){
                    largestRangeNum=i;
                }  
            }
        }
        for(int i=0;i<10;i++){
            for(int k=2;k<10;k++){
                 if(sixteenPerGame[i]<sixteenPerGame[smallestRangeNum]){
                    smallestRangeNum=i;
                }  
            }
        }
        System.out.println("3. " + df.format((sixteenPerGame[largestRangeNum]-sixteenPerGame[smallestRangeNum])));
    
        //4
        double[] eightteenPerGame = new double[10];
        for(int i=0; i<=9; i++){
        eightteenPerGame[i] = (averageSal[i]*1000000)/18;
        //System.out.println(df.format(eightteenPerGame[i]));
        } 
        
        int largestAverageNum=0;
        int smallestAverageNum=0;
        for(int i=0;i<10;i++){
            for(int k=2;k<10;k++){
                 if(eightteenPerGame[i]>eightteenPerGame[largestAverageNum]){
                    largestAverageNum=i;
                }  
            }
        }
        for(int i=0;i<10;i++){
            for(int k=2;k<10;k++){
                 if(eightteenPerGame[i]<eightteenPerGame[smallestAverageNum]){
                    smallestAverageNum=i;
                }  
            }
        }
        System.out.println("4. " + df.format(((eightteenPerGame[largestAverageNum]+eightteenPerGame[smallestAverageNum])/2)));
    
        //5
        double[] differencePerGame = new double[10];
        for(int i=0; i<=9; i++){
        differencePerGame[i] = sixteenPerGame[i]-eightteenPerGame[i];
        } 
        
        double averageDifference=0;
        for(double i:differencePerGame){
            averageDifference = averageDifference + i;
        }
        averageDifference = averageDifference/10;
        System.out.println("5. " + df.format(averageDifference));
    }
    
        
       
        
        
        
        
        
        
        
       
}
