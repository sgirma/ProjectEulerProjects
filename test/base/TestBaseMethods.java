package base;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class TestBaseMethods {

	@Test
	public void testIsEvenTrue() {
		BaseMethods bm = new BaseMethods();
		Method method;
		try {
			method = bm.getClass().getDeclaredMethod("isEven", Long.TYPE);
			method.setAccessible(true);
			assertEquals(true, method.invoke(bm, 2));
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testIsEvenFalse() {
		BaseMethods bm = new BaseMethods();
		Method method;
		try {
			method = bm.getClass().getDeclaredMethod("isEven", Long.TYPE);
			method.setAccessible(true);
			assertEquals(false, method.invoke(bm, 3));
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testIsPrimeTrue() {
		BaseMethods bm = new BaseMethods();
		Method method;
		try {
			method = bm.getClass().getDeclaredMethod("isPrime", Long.TYPE);
			method.setAccessible(true);
			assertEquals(true, method.invoke(bm, 3));
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testIsPrimeFalse() {
		BaseMethods bm = new BaseMethods();
		Method method;
		try {
			method = bm.getClass().getDeclaredMethod("isPrime", Long.TYPE);
			method.setAccessible(true);
			assertEquals(false, method.invoke(bm, 9));
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testIsPerfectSquareTrue() {
		BaseMethods bm = new BaseMethods();
		Method method;
		try {
			method = bm.getClass().getDeclaredMethod("isPerfectSquare", Long.TYPE);
			method.setAccessible(true);
			assertEquals(true, method.invoke(bm, 4));
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testIsPerfectSquareTrue2() {
		BaseMethods bm = new BaseMethods();
		Method method;
		try {
			method = bm.getClass().getDeclaredMethod("isPerfectSquare", Long.TYPE);
			method.setAccessible(true);
			assertEquals(true, method.invoke(bm, 9));
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testIsPerfectSquareTrue3() {
		BaseMethods bm = new BaseMethods();
		Method method;
		try {
			method = bm.getClass().getDeclaredMethod("isPerfectSquare", Long.TYPE);
			method.setAccessible(true);
			assertEquals(true, method.invoke(bm, 16));
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testIsPerfectSquareFalse() {
		BaseMethods bm = new BaseMethods();
		Method method;
		try {
			method = bm.getClass().getDeclaredMethod("isPerfectSquare", Long.TYPE);
			method.setAccessible(true);
			assertEquals(false, method.invoke(bm, 10));
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testIsFibSequenceTrue() {
		BaseMethods bm = new BaseMethods();
		Method method;
		try {
			method = bm.getClass().getDeclaredMethod("isFibSequence");
			method.setAccessible(true);
			assertEquals(true, method.invoke(bm, 3));
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testIsFibSequenceFalse() {
		BaseMethods bm = new BaseMethods();
		Method method;
		try {
			method = bm.getClass().getDeclaredMethod("isFibSequence");
			method.setAccessible(true);
			assertEquals(false, method.invoke(bm, 6));
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
