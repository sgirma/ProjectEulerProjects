package projecteulerprojects;

import static org.junit.Assert.*;

import org.junit.Test;

public class SmallestMultipleTest {

	@Test
	public void testSmallestMultiple() {
		SmallestMultiple sm = new SmallestMultiple();
		
		assertEquals(232792560, sm.smallestMultiple());
	}

}
