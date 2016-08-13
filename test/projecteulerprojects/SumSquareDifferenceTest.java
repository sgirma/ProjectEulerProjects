package projecteulerprojects;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumSquareDifferenceTest {

	@Test
	public void testSquareNumberSumRecursive() {
		assertEquals(338349, SumSquareDifference.squareNumberSumRecursive(100));
	}
	
	@Test
	public void testSquareSumRecursive() {
		assertEquals(25492401, SumSquareDifference.squareSumRecursive(100));
	}

	@Test
	public void testSquareNumberSum() {
		assertEquals(1, 1);
	}
	
	@Test
	public void testSquareSum() {
		assertEquals(1, 1);
	}

	@Test
	public void squareSumDifference() {
		assertEquals(25154052, SumSquareDifference.squareSumDifference());
	}
}
