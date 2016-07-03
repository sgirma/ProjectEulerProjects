package projecteulerprojects;

public class SmallestMultiple {

	public SmallestMultiple() {
		// TODO Auto-generated constructor stub
	}
	
	public int smallestMultiple() {
		int tenSmMult = 2520;
		int i = 0;
		
		while(true) {
			for(i = 20; i >= 1; i--) {
				if(tenSmMult % i == 0) {
					continue;
				} else {
					break;
				}
			}
			
			if(i <= 1) {
				break;
			} else {
				tenSmMult++;
			}
		}
		
		return tenSmMult;
	}

}
