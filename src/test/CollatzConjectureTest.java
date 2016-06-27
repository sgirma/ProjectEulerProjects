package test;

import java.util.List;

import org.junit.Test;

import collatzconjecture.CollatzConjecture;

public class CollatzConjectureTest {
	List<Long> vals;
	
	@Test
	public void testRecursiveConjecture() {
		CollatzConjecture cc = new CollatzConjecture();
		vals = cc.recursiveCollatz(10);
		
		System.out.println(vals.size() - 1 + ": " + vals);
	}
	
	@Test
	public void testRecursiveConjectureHighestValue() {
		CollatzConjecture cc = new CollatzConjecture();
		vals = cc.recursiveCollatz(9780657630L);
		
		System.out.println(vals.size() - 1 + ": " + vals);
	}
}
