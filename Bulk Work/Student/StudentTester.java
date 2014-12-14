
/**
 * Excercise P3.7
 * 
 * @author (Kevin Callahan) 
 * @version (10/17/10)
 */

public class StudentTester
{
    public static void main (String[] args)
    {
        Student theBrain= new Student("Joe Tester");
        theBrain.addQuiz(90);
        theBrain.addQuiz(95);
        theBrain.addQuiz(80);
        theBrain.addQuiz(100);
        System.out.println(theBrain.getName() + "'s total grade was " + theBrain.getTotalscore() + " and the average was " + theBrain.getAverage());
    }
}