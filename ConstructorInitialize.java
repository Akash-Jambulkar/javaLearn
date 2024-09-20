package java00;

public class ConstructorInitialize {
	
	int id;
	String name;
	
	public static void main(String[] args) {
		
		ConstructorInitialize student1 = new ConstructorInitialize(5, "Akash");
		
		// Print the initialized values
		System.out.println("Student ID: " + student1.id);
		System.out.println("Student Name: " + student1.name);
	}

	public ConstructorInitialize(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
