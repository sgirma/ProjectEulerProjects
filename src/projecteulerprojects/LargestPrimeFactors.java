package projecteulerprojects;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

import base.BaseMethods;

/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * 
 */
public class LargestPrimeFactors extends BaseMethods {
	private static List<Long> pFactors = new ArrayList<Long>();
	private static Stack<Long> pFactorsStack = new Stack<Long>();
	private long product = 1;
	private long productStack = 1;
	static HashSet<Long> primeFactors = new HashSet<Long>();
	
	public static void main(String[] args) {
		long n = 600851475143L;
		n = 131857;
		int product = 1;
		HashSet<Long> arnd = findLargestPrimeFactors(n);
		for(Long l : arnd) {
			System.out.println(l);
			product *= l;
		}
		
		System.out.println(product);
	}
	
	/**
	 * avoid using, super cheat method, also very slow
	 **/
	public static HashSet<Long> findLargestPrimeFactors(long n) {
		long larger = 0;
		
		for(int i = 0; i < n; i++) {
			if(isPrime(n)) {
				primeFactors.add(n);
				break;//return primeFactors;
			}
			
			if(isPrime(i) && n % i == 0) {
				// primeFactors.add((long) i);
				larger = n / i;
				findLargestPrimeFactors(larger);
			}
		}
		
		return primeFactors;
	}
	
	/**
	 * improve findLargestPrimeFactors, this will return an arraylist of values
	 * @param n
	 * @return
	 */
	public List<Long> largestPrimeFactors(long n) {       
		if(isPrime(n)) {
			product *= n;
			pFactors.add(n);
			return pFactors;
		}

		for(int i = 0; i < n; i++) {
			if(product >= n) {
				return pFactors;
			}
			try {
				if(isPrime(i) && n % i == 0) {
					product *= i;
					pFactors.add((long)i);
					largestPrimeFactors(n/i);
				}
			} catch(ArithmeticException ae) {
				continue;
			}
		}

		return pFactors;
	}
	
	/**
	 * improve findLargestPrimeFactors, this will return a stack
	 * makes it easy just to pop/peek the last value, consider using deque
	 * instead to improve efficiency
	 * @param n
	 * @return
	 */
	public Stack<Long> largestPrimeFactorsStack(long n) {       
		if(isPrime(n)) {
			productStack *= n;
			pFactorsStack.push(n);
			return pFactorsStack;
		}

		for(int i = 0; i < n; i++) {
			if(productStack >= n) {
				return pFactorsStack;
			}
			try {
				if(isPrime(i) && n % i == 0) {
					productStack *= i;
					pFactorsStack.push((long)i);
					largestPrimeFactorsStack(n/i);
				}
			} catch(ArithmeticException ae) {
				continue;
			}
		}

		return pFactorsStack;
	}
}
