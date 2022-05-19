package cyberNatices;

import java.util.Scanner;

public class StudentBiography{
	
	Scanner cannon = new Scanner(System.in);
	
	
	String firstName;
	String lastName;
    double rollNumber;
	
	public String studentFirstName() {
		
		System.out.println(" please enter the first name:");
		   firstName = cannon.nextLine();
		   return firstName;
	}
	public String studentlastName() { 
		
		System.out.println(" please enter the last name :");
		lastName = cannon.nextLine();
		return lastName;
	}
	public double rollNumber() {
		
		System.out.println("please enter the roll number: ");
		rollNumber = cannon.nextDouble();
		return rollNumber;
	}
	
	

	

}
