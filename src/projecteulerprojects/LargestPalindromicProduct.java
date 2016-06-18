package projecteulerprojects;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product
 * of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * @author sgirma
 *
 */
public class LargestPalindromicProduct {

	public LargestPalindromicProduct() {
		
	}
	
	public int[] largestPalindromicProductFinder() {
		int lpp = 998001;
		int lowerPalProd = 10000;

		int[] largestProducts = new int[2]; 
		
		for (int i = lpp; i >= lowerPalProd; i--) {
			if(!isPalindrome(i)) {
				continue;
			} else {
				for(int n = 999; n >= 100; n--) {
					if(i % n == 0) {
						largestProducts[0] = i / n;
						largestProducts[1] = n;
						return largestProducts;
					}
				}
			}
		}
		
		return largestProducts;
	}
	
	/**
	 * takes in a number, compares it to the reverse, using string builder
	 * @param num
	 * @return
	 */
	private boolean isPalindrome(int num) {
		return String.valueOf(num).equals((new StringBuilder(String.valueOf(num))).reverse().toString());
	}
}
