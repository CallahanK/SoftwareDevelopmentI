
/**
 * Excercise P3.4
 * 
 * @author (Kevin Callahan) 
 * @version (10/17/10)
 */

public class EmployeeTester
{
    public static void main (String[] args)
    {
        Employee temp = new Employee("Hard Worker",100);
        
        System.out.println("The employee's name is " + temp.getName() + " and makes $" + temp.getSalary());
        
        //P3.5
        temp.raiseSalary(10);
        System.out.println("After the raise, the new salary is $" + temp.getSalary());
    }
}
