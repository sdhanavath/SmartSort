package edu.adias.smart.sort;

import org.junit.Assert;
import org.junit.Test;

public class TestSortNumbers {
	@Test
	public void testIt(){
		Integer[] numbers = {6,7,8,9,10};
		Assert.assertEquals(0, SortNumbers.sort(numbers));
		
	}
}
