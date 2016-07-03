package projecteulerprojects;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import projecteulerprojects.LargestPrimeFactors;

public class LargestPrimeFactorsTest {
	@Test
	public void testLargestPrimeFactorsStack() {
		LargestPrimeFactors lpf = new LargestPrimeFactors();
		long n = 600851475143L;
		
		assertEquals((Long) 6857L, lpf.largestPrimeFactorsStack(n).peek());
	}


	@Test
	public void testLargestPrimeFactors() {
		LargestPrimeFactors lpf = new LargestPrimeFactors();
		long n = 600851475143L;
		List<Long> pFactors = new ArrayList<Long>();
		pFactors.add(71L);
		pFactors.add(839L);
		pFactors.add(1471L);
		pFactors.add(6857L);
		
		assertEquals(pFactors, lpf.largestPrimeFactors(n));
	}
}
