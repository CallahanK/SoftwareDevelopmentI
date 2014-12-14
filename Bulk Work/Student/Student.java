
/**
 * Student Constructor
 * 
 * @author (Kevin Callahan) 
 * @version (10/17/10)
 */


public class Student
{
    public Student()
    {
        name="";
        quiztotal=0;
        average=0;
        totalscore=0;
    }
    
    public Student(String initialName)
    {
        name=initialName;
    }
    
    public void addQuiz(double grade)
    {
        totalscore=totalscore+grade;
        quiztotal=quiztotal+1;
        average=totalscore/quiztotal;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getTotalscore()
    {
        return totalscore;
    }
    
    public double getAverage()
    {
        return average;
    }
    
    
    private double average;
    private double totalscore;
    private int quiztotal;
    private String name;
}