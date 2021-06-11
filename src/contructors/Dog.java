package contructors;

public class Dog {
	public String name;
	public int age;
	public int weight;
	
	// constructor because name is shared with class
	public Dog(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;

	}
	
	public Dog(int age) {
		// this is basically the other constructor on line 8
		this("No name", 12, age); // must come before any additional code

	}

}
