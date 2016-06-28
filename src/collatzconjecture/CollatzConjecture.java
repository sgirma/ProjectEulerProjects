package collatzconjecture;

import java.util.ArrayList;
import java.util.List;

import base.BaseMethods;

/**
 * the collatz conjecture is a conjecture in mathematics also
 * known as 3x + 1. The  conjecture can be summarized as follows.
 * Take any positive integer n. If n is even, divide it by 2 to get n / 2.
 * If n is odd, multiply it by 3 and add 1 to obtain 3n + 1. Repeat the
 * process (which has been called "Half Or Triple Plus One", or HOTPO[7])
 * indefinitely. The conjecture is that no matter what number you start
 * with, you will always eventually reach 1. https://xkcd.com/710/
 * @author saigrr
 *
 */
public class CollatzConjecture extends BaseMethods{
	List<Long> vals = new ArrayList<Long>();
	
	public List<Long> recursiveCollatz(long x) {
		if(x > 0) {
			vals.add(x);
			
			if(x == 1) {
				//uncomment to view full list of values
//				System.out.println(vals.size() + " : " + Arrays.toString(vals.toArray()));
				return vals;
			}
			
			if(isEven(x)) {
				recursiveCollatz(x/2);
			} else {
				recursiveCollatz(3 * x + 1);
			}
		}
		else {
			System.out.println("don't do that... you know what you did");
		}
		
		return vals;
	}
}
