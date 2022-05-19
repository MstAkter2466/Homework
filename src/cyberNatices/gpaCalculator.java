package cyberNatices;

import java.util.Scanner;

public class gpaCalculator {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String firstName;
		String lastName;
		int rollNumber;
		
		System.out.println("please enter your first name");
		firstName = keyboard.nextLine();
		
		System.out.println("please enter your last name");
		lastName = keyboard.nextLine();
		
		System.out.println("please enter your roll number");
		rollNumber = keyboard.nextInt();
		
		
		double banglaNumber;
		double englishNumber;
		double mathNumber;
		double biologyNumber;
		
		System.out.println("please enter your bangla number");
		banglaNumber = keyboard.nextDouble();
		
		System.out.println("please enter your english number");
		englishNumber = keyboard.nextDouble();
		
		System.out.println("please enter your math number");
		mathNumber = keyboard.nextDouble();
		
		System.out.println("please enter your biology number");
		biologyNumber = keyboard.nextDouble();
		
		
		double avarageMark = (banglaNumber + englishNumber + mathNumber + biologyNumber)/4;
		System.out.println("your avarage number is " + avarageMark);
		
		if(avarageMark>=90 && avarageMark<=100) {
			System.out.println("Your Grade is A");
			
		}else if(avarageMark>=80 && avarageMark<=89) {
			System.out.println("Your Grade is B");
			
		}else if(avarageMark>=70 && avarageMark<=79) {
			System.out.println("Your Grade is C");
			
		}else if(avarageMark>=60 && avarageMark<=69) {
			System.out.println("Your Grade is D");
			
		}else if(avarageMark>=50 && avarageMark<=59) {
			System.out.println("Your Grade is E");
			
		}else {
			System.out.println("Your Grade is F");
			
		}
		

	}

}
