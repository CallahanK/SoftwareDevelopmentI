package People;

public class PeopleTester {


	public static void main(String[] args) {
		Person a = new Person("Joe Tester",1992);
		Student b = new Student("H.D. Worker",1993,"Advanced Breathing 101");
		Instructor c = new Instructor("Prof H.L.",1980,9999);
		
		System.out.println(a.nameToString()+". "+a.yearBirthToString());
		System.out.println(b.nameToString()+". "+b.yearBirthToString()+". "+b.majorToString());
		System.out.println(c.nameToString()+". "+c.yearBirthToString()+". "+c.salaryToString());

	}
	
}
