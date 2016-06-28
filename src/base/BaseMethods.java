package base;

public class BaseMethods {

	public BaseMethods() {
		// TODO Auto-generated constructor stub
	}
	
	protected boolean isEven(long value) {
		return (value % 2 == 0) ? true : false;
	}
	
	protected static boolean isPrime(long value) {
		if(value <= 1) {
			return false;
		} else if (value <= 3) {
			return true;
		} else if (value % 2 == 0 || value % 3 == 0) {
			return false;
		}
		int i = 5;
		while(i * i <= value) {
			if(value % i == 0 || value % (i+2) == 0) {
				return false;
			}
			
			i += 6;
		}
		return true;
	}

}
