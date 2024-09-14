package java00;

public class ControlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using if, else if and else conditions:
		//ladder : when using if and else if 
		//nesting : when using if inside if 
		int num1 = 12;
		if(num1>0) {
			System.out.println("Number is Positive.");
		}
		else if(num1 == 0) {
			System.out.println("Number is Zero.");
		}
		else {
			System.out.println("Number is Negative.");
		}
		
		//Switch statements: break is important else all the cases will be running
		switch("a") {
		case "a":
			System.out.println("CASE A MATCHED");
			break;
			
		case "b":
			System.out.println("CASE B MATCHED");
			break;
		
		default: 
			System.out.println("NOTHING MATCHED");
			break;
		}
		
		//loops
		//for loop:
		for(int i =1; i<=10; i++){
			System.out.println("Value of i : "+i);
		}	
		
		//while loop:
		while(num1 > 5) {
			System.out.println("value of num1 : "+num1);
			num1 -= 5;
		}
		
		//do while loop: 
		do {
			System.out.println("Hello World");
		}while(num1 == 7);
		
		//for-each loops:
		int nums[] = {0,1,2,3,4,5};
		for(int x : nums) {
			System.out.print(x+" ");
		}
	}
}

