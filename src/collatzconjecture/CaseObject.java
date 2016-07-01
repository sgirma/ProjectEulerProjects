package collatzconjecture;

import base.BaseMethods;

public class CaseObject extends BaseMethods {
	private long value;
	private int size;
	private boolean isEven;
	private boolean isPrime;
	private boolean isPerfectSquare;
	private boolean isFibSequence;
	private float ratio;
	
	public CaseObject() {
		
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}

	public boolean isEven() {
		return isEven;
	}

	public void setEven(boolean isEven) {
		this.isEven = isEven;
	}

	public boolean isPrime() {
		return isPrime;
	}

	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public float getRatio() {
		return ratio;
	}

	public void setRatio(float ratio) {
		this.ratio = ratio;
	}

	public boolean isPerfectSquare() {
		return isPerfectSquare;
	}

	public void setPerfectSquare(boolean isPerfectSquare) {
		this.isPerfectSquare = isPerfectSquare;
	}

	public boolean isFibSequence() {
		return isFibSequence;
	}

	public void setFibSequence(boolean isFibSequence) {
		this.isFibSequence = isFibSequence;
	}
}
