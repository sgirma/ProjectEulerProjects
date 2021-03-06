package projecteulerprojects;

import java.util.ArrayList;
import java.util.List;

import base.BaseMethods;

/**
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 * find the sum of the even-valued terms.
 * @author sgirma
 *
 */
public class EvenFibonacciNumbers extends BaseMethods {

	public int fibSolver(int upperLimit) {
		List<Integer> fibValues = new ArrayList<Integer>();
		int sum = 0;
		int i = -1;
		
		do {
			i++;
			if(i <= 1) {
				fibValues.add(1);
				continue;
			}
			
			fibValues.add(fibValues.get(i - 1) + fibValues.get(i-2));
			
			if(isEven(fibValues.get(i))) {
				sum += fibValues.get(i);
			}
		} while(fibValues.get(i) <= upperLimit);
		
		return sum;
	}
}
