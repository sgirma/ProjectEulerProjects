package projecteulerprojects;

import static org.junit.Assert.*;

import org.junit.Test;

import projecteulerprojects.FizzBuzz;

public class FizzBuzzTest {
	FizzBuzz fz;

	@Test
	public void testFizzBuzzSolver10() {
		fz = new FizzBuzz();
		assertEquals(23, fz.fizzBuzzSolver(10));
	}
	
	@Test
	public void testFizzBuzzSolver1000() {
		fz = new FizzBuzz();
		assertEquals(233168, fz.fizzBuzzSolver(1000));
	}

}
