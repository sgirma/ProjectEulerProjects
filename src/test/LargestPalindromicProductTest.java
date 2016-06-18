package test;

import static org.junit.Assert.*;

import org.junit.Test;

import projecteulerprojects.LargestPalindromicProduct;

public class LargestPalindromicProductTest {
	LargestPalindromicProduct lpp = new LargestPalindromicProduct();
	
	@Test
	public void testLargestPalindromicProductFinder() {
		int[] largestProducts = {913, 993};
		
		assertEquals(largestProducts, lpp.largestPalindromicProductFinder());
	}
}
