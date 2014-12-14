/**
 * Employee Constructor
 * 
 * @author (Kevin Callahan) 
 * @version (10/15/10)
 */


public class Employee 
{
    public Employee()
    {
        name="";
        salary=0;
    }
   
    public Employee(String initialName, double interestSalary)
    {
        name = initialName;
        salary = interestSalary;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    //P3.5
    public void raiseSalary(double byPercent)
    {
        salary=(100*salary + salary*byPercent)/100;
    }
    
    
    private String name;
    private double salary;
}