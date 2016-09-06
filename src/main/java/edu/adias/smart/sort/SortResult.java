package edu.adias.smart.sort;

import java.io.Serializable;

public class SortResult implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer[] numbers;
	
	private Integer[] afterSort;
	
	private long executionTime;
	
	private int numberOfSwaps;

	public Integer[] getNumbers() {
		return numbers;
	}

	public void setNumbers(Integer[] numbers) {
		this.numbers = numbers;
	}

	public Integer[] getAfterSort() {
		return afterSort;
	}

	public void setAfterSort(Integer[] afterSort) {
		this.afterSort = afterSort;
	}

	public long getExecutionTime() {
		return executionTime;
	}

	public void setExecutionTime(long executionTime) {
		this.executionTime = executionTime;
	}

	public int getNumberOfSwaps() {
		return numberOfSwaps;
	}

	public void setNumberOfSwaps(int numberOfSwaps) {
		this.numberOfSwaps = numberOfSwaps;
	}

}
