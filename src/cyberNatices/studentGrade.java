package cyberNatices;

import java.util.Scanner;

public class studentGrade {

	public static void main(String[] args) {
		Scanner cannon = new Scanner(System.in);
	
		
		
		int avarageMark = 0;
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
