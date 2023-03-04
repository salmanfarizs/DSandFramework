package interview.thoughtworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class Interview {
	
	
	
	//Problem statement
	/*
	 * 
	 * 75221110

	 * pseudo code
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void execute() {
		
		int nums[] = {10,15,17,22};
		
		System.out.println(biggesNumber(nums));
		
	}

	
	private int biggesNumber(int nums[]) {
		
		//brute force

		/*List<String> list = new ArrayList<String>();

		for (int i = 0; i < nums.length; i++) {
 
			String number = String.valueOf(nums[i]);   //O[n+m]

			for (int j = 0; j < number.length(); j++) {
				list.add(number.charAt(j) + "");
			}

		}

		String output = "";

		Collections.sort(list);

		System.out.println(list);

		for (int i = list.size() - 1; i >= 0; i--) {

			output += list.get(i);
		}

		int biggestNumber = Integer.parseInt(output);
*/
		
		
		List<Character> list = new ArrayList<Character>();
		
		String number2 = "";
		for (int i = 0; i < nums.length; i++) {
			 
			 number2+= String.valueOf(nums[i]);

			

		}

		System.out.println(number2);
		
		
		char[] charArray = number2.toCharArray();
		
		
		for(char c : charArray) list.add(c);
		
		//Collections.sort(list);

		String output = "";

		Collections.sort(list,Collections.reverseOrder());
		
		String a[] = {"1","3","4","5","6","0","3","4"};
		
		Arrays.sort(a,Collections.reverseOrder());
		
		System.out.println(Arrays.toString(a));
		
		//Collections.reverse(list);
		
		//Collections.reverse(list);
		
		System.out.println(list);
		
		 //O[n]
		

		for (int i = 0; i <list.size(); i++) {

			output += list.get(i);
		}

		int biggestNumber = Integer.parseInt(output);

		
		
		return biggestNumber;
	}
}
