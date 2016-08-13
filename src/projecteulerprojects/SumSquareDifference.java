package projecteulerprojects;

public class SumSquareDifference {
	private static int sum = 0;

	public SumSquareDifference() {
		// TODO Auto-generated constructor stub
	}
	
	public static int squareNumberSumRecursive(int initial) {
		if(initial == 100) {
			sum = 0;
		}
		
		if(initial == 1) {
			return sum;
		}
		
		sum += (initial * initial);
		
		initial--;
		
		return squareNumberSumRecursive(initial);
	}
	
	public static int squareSumRecursive(int initial) {
		if(initial == 100) {
			sum = 0;
		}
		
		if (initial == 1) {
			return sum * sum;
		}
		
		sum += initial;
		initial--;
		
		return squareSumRecursive(initial);
	}
	
	public static void squareNumberSum() {
		
	}
	
	public static void squreSum() {
		
	}
	
	public static int squareSumDifference() {
		int init = 100;
		return squareSumRecursive(init) - squareNumberSumRecursive(init);
	}
}