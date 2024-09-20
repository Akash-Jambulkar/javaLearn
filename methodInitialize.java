package java00;

public class methodInitialize {
	
	int id;
	String name;
	
	//method for inserting values:
	void insertValues(int schollarNumber, String fullName) {
		id = schollarNumber;
		name = fullName;
	}
	
	//method to display information: 
	void display() {
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		
		methodInitialize student1 = new methodInitialize();
		
	student1.insertValues(1, "Akash Jambulkar");
	student1.display();
	
	}
}
