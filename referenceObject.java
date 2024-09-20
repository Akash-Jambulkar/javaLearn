package java00;

public class referenceObject {
	
	int id;
	String name; 
	
	public static void main(String[] args) {
		
		referenceObject student1 = new referenceObject();
		student1.id = 1;
		student1.name="Akash";
		
		System.out.println(student1.id+ " "+student1.name);
		
	}
	
}
