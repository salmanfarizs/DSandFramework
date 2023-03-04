package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import gherkin.lexer.Ar;

public class MaxMin {
	
	
	/*
	 * Given five positive integers, find the minimum and maximum values that can be calculated by summing
	 *  exactly four of the five integers. Then print the respective minimum and maximum values as a single line
	 *   of two space-separated long integers.

   Example

The minimum sum is  and the maximum sum is . The function prints

16 24
	 * 
	 * 1,2,3,4,28
	 * [1,3,5,7,9]
	 * 
	 * 256741038 623958417 467905213 714532089 938071625
	 */
	
	@Test
	public void runner() {
		
		List<Integer> arr = new ArrayList<>(); 
		arr.add(793810624);
		arr.add(895642170);
		arr.add(685903712);
		arr.add(623789054);
		arr.add(468592370);
		
		solution(arr);
	}

	private void solution(List<Integer> arr) {
		
		Collections.sort(arr);
		System.out.println(arr);
		
		
		
		long min = (long) Math.addExact(arr.get(0), arr.get(1));
		long min2 = Math.addExact(min, arr.get(2));
		long min3 = Math.addExact(min2, arr.get(3));
		long max = (long) (min3 - arr.get(0))+arr.get(4);
		

		System.out.println(min3 + " " + max);
		
		
	}

}
