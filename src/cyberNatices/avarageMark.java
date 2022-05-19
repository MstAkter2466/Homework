package cyberNatices;

import java.util.Scanner;

public class avarageMark {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		
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

	}

}
