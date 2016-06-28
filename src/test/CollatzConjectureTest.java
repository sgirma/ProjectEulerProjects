package test;

import static org.junit.Assert.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import collatzconjecture.CollatzConjecture;

public class CollatzConjectureTest {
	List<Long> vals;
	
//	@Test
//	public void testRecursiveConjecture() {
//		CollatzConjecture cc = new CollatzConjecture();
//		vals = cc.recursiveCollatz(10);
//		
//		System.out.println(vals.size() - 1 + ": " + vals);
//	}
	
	@Test
	public void testRecursiveConjectureHighestValue() {
		CollatzConjecture cc = new CollatzConjecture();
		vals = cc.recursiveCollatz(9780657630L);
		
		assertEquals(vals.get(vals.size() - 1), Long.valueOf(1));
	}
	
	@Test
	public void testRecursiveConjectureAll() {
		CollatzConjecture cc;
		
		for(int i = 1; i < 100; i++) {
			cc = new CollatzConjecture();
			vals = cc.recursiveCollatz(i);
			assertEquals(vals.get(vals.size() - 1), Long.valueOf(1));
		}
	}
	
	@Test
	public void testHighest() {
		CollatzConjecture cc;
		
		LinkedHashMap<Integer, Integer> highestVals = new LinkedHashMap<Integer, Integer>();
		int size = 0;
		
		for(int i = 1; i < 100; i++) {
			cc = new CollatzConjecture();
			size = cc.recursiveCollatz(i).size();
			if(size >= 100) {
				highestVals.put(i, size);
			}
		}

		System.out.println("highest: ");
		
		for(Map.Entry<Integer, Integer> entry : highestVals.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		System.out.println();
	}
	
	@Test
	public void testLowest() {
		CollatzConjecture cc;
		
		Map<Integer, Integer> lowestVals = new LinkedHashMap<Integer, Integer>();
		int size = 0;
		
		for(int i = 1; i < 100; i++) {
			cc = new CollatzConjecture();
			size = cc.recursiveCollatz(i).size();
			if(size <= 10) {
				lowestVals.put(i, size);
			}
		}
		
		System.out.println("lowest: ");
		
		for(Map.Entry<Integer, Integer> entry : lowestVals.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		System.out.println();
	}
}
