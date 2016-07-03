package projecteulerprojects;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import base.BaseMethods;
import collatzconjecture.CaseObject;
import collatzconjecture.CollatzConjecture;

// TODO consider refactoring to use reflection to implement
// even/prime methods instead of extending basemethod??
public class CollatzConjectureTest extends BaseMethods {
	List<Long> vals;
	List<CaseObject> cos;
	
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
	
	@Test
	public void testRecursiveHigherInspection() {
		CollatzConjecture cc;
		CaseObject co;
		cos = new ArrayList<CaseObject>();
		
		for(int i = 1; i < 100; i++) {
			co = new CaseObject();
			cc = new CollatzConjecture();
			vals = cc.recursiveCollatz(i);
			
			// TODO instead of using size greater than 100
			if(vals.size() >= 100) {
				co.setValue(i);
				co.setSize(vals.size());
				co.setEven(isEven(i));
				co.setPrime(isPrime(i));
				cos.add(co);
			}
		}
		
		System.out.println("value\tsize\teven\tprime");
		for(CaseObject oc : cos) {
			System.out.println(oc.getValue() + "\t" + oc.getSize() + "\t" + oc.isEven() + "\t" + oc.isPrime());
		}
	}
	
	@Test
	public void testRecursiveInspectionUsingRatio() {
		CollatzConjecture cc;
		CaseObject co;
		cos = new ArrayList<CaseObject>();
		
		for(int i = 1; i < 1000; i++) {
			co = new CaseObject();
			cc = new CollatzConjecture();
			vals = cc.recursiveCollatz(i);
			float ratio = (float)i/vals.size();
			
			// TODO instead of using size greater than 100
			if(ratio <= 1) {
				co.setValue(i);
				co.setSize(vals.size());
				// unnecessary to cast
				co.setRatio(ratio);
				co.setEven(isEven(i));
				co.setPrime(isPrime(i));
				co.setPerfectSquare(isPerfectSquare(i));
				co.setFibSequence(isFibSequence(i));
				cos.add(co);
			}
		}
		
		System.out.println("value\tsize\teven\tprime\tp sq\tfib seq\tratio");
		for(CaseObject oc : cos) {
			System.out.println(oc.getValue() + "\t" + oc.getSize() + "\t" + oc.isEven() + "\t" +
					oc.isPrime() + "\t" + oc.isPerfectSquare() + "\t" + oc.isFibSequence() + "\t" + oc.getRatio());
		}
	}
}
