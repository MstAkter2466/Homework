package cyberNatices;

public class book {

	public class StudentAvarage extends StudentMarks{
		static double avarageMark;
		
		static double valueA = StudentMark.studentBanMarks();
		static double valueB = StudentMark.studentEngMarks();
		static double valueC = StudentMark.studentMathMarks();
		static double valueD = StudentMark.studentBioMarks();
		
		public static double studentAvarageMarks() {
			
			avarageMark = (valueA + valueB + valueC + valueD )/4;
			
			return avarageMark;
		}
		

	}

}
