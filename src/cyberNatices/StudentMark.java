package cyberNatices;

import java.util.Scanner;

public class StudentMark {
	
	Scanner input = new Scanner(System.in);
	
	double banglaNumber;
	double englishNumber;
	double mathNumber;
	double biologyNumber;
	
	public double studentbangNumber() {
		
		System.out.println("please enter the bangNumber");
		double bangNumber = input.nextDouble();
		return bangNumber;
	}
	public double studentengNumber() {
		
		System.out.println("please enter the engNumber");
		double engNumber = input.nextDouble();
		return engNumber;
	}
	
	public double studentmathNumber() {
		
		System.out.println("please enter the mathNumber");
		double mathNumber = input.nextDouble();
		return mathNumber;
				
	}
	public double studentbiology() {
		
		System.out.println("please enter the biologyNumber");
		double biologyNumber = input.nextDouble();
		return biologyNumber;
	}

}
