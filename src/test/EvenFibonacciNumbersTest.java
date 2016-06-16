package test;

import static org.junit.Assert.*;

import org.junit.Test;

import projecteulerprojects.EvenFibonacciNumbers;

public class EvenFibonacciNumbersTest {
	EvenFibonacciNumbers efn;
	
	@Test
	public void testEvenFibSolver() {
		efn = new EvenFibonacciNumbers();
		assertEquals(4613732, efn.fibSolver(4000000));
	}
}
