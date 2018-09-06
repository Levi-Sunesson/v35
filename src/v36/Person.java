package v36;

public class Person {

	String name;
	int age;
	
	public Person(String name, int age) {
		
		setName(name);
		this.age = age;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void Oldest(Person p1, Person p2) {
		
		if (p1.age > p2.age)
			System.out.println(p1.name);
		else
			System.out.println(p2.name);
		
	}
	
}
