package People;

public class Instructor extends Person {
	private int salary;
	
	public Instructor(){
		super();
	}
	
	public Instructor(String initialName,int initialYearBirth,int initialSalary){
		super(initialName,initialYearBirth);
		salary=initialSalary;
	}
	
	public String salaryToString(){
		return "Salary is " + Integer.toString(salary);
	}
}
