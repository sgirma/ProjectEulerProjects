package projecteulerprojects;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * 
 */
public class LargestPrimeFactors {
	static HashSet<Long> primeFactors = new HashSet<Long>();
	
	public static void main(String[] args) {
		long n = 600851475143L;
//		n = 13195;
		HashSet<Long> arnd = findLargestPrimeFactors(n);
		for(Long l : arnd) {
			System.out.println(l);
		}
	}
	
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
	
	private static boolean isPrime(long value) {
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
