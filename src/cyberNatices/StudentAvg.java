package cyberNatices;

public class StudentGrade extends Studentavg { 
	
	public void gradeCalculator() {
	
       Object StudentAvg;
	double avg = StudentAvg.studentavgMark();
       
       
       if(avg>=90 && avg<=100) { 
    	   
    	   System.out.println("Your Grade is A");
    	   
       }else if(avg>=80 && avg<=89 ) {
    	   System.out.println("Your Grade is B ");
    	   
    	   
       }else if(avg>=70 && avg<=79) {
    	   
    	   System.out.println("Your Grade is C");
    	   
       }else if(avg>=60 && avg<=69) {
    	   
    	   System.out.println("Your Grade is D");
    	   
    	   
       }else if(avg>=50 && avg<=59) {
    	   
    	   System.out.println("Your Grade is E");
    	   
       }else {
    	   
    	   System.out.println("Your Grade is F");
       }

	
	}

}
