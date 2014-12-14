package People;


public class Person {	
	private String name;
	private int yearBirth;

	
	public Person(){
		name="";
		yearBirth=0;
	}
	
	public Person(String initialName,int initialYearBirth){
		name = initialName;
		yearBirth = initialYearBirth;
	}
	
	public String nameToString(){
		return "Name is " + name;
	}
	
	public String yearBirthToString(){
		return "Year of birth is " + Integer.toString(yearBirth);
	}
}
