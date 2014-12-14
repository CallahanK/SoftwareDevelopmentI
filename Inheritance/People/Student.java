package People;

public class Student extends Person {
	private String major;
	
	public Student(){
		super();
	}
	
	public Student(String initialName,int initialYearBirth,String initialMajor){
		super(initialName,initialYearBirth);
		major=initialMajor;
	}
	
	public String majorToString(){
		return "Major is " + major;
	}
	
}
