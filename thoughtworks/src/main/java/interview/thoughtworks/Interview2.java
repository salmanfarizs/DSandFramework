package interview.thoughtworks;

import java.util.Arrays;

import org.junit.Test;

public class Interview2 {
	
	
	
	/***
	 * 
	 * 
	 * Problem: Given a number, increment the odd digits of the
	 *  number & decrement the even digits of the number. Consider number ranges only from 0-9.
	 *   So to decrement 0 use 9 & to increment 9 use 0. Consider 0th digit as even.

	 * 
	 * 
	 * 
	 * 
	 * 0 1 2 3 4 5 6 7 8 9
	 */
	
	
	
	@Test
	public void execute() {
		
		int number = 37290;
	//	28109

		System.out.println(print(number));
		
	}
	
	private int print(int number) {
		
		
		//System.out.println(number%10);
		
		String str = String.valueOf(number);
		
		int nums[] = new int[str.length()];
		
		
		for(int i=0;i<str.length();i++) {
			
			nums[i]=Integer.parseInt((str.charAt(i) +""));
		}
		
		
		System.out.println(Arrays.toString(nums));
		
		for(int i=0;i<nums.length;i++) {
			
			if(nums[i]%2==0 && i!=0 && nums[i]!=0) {
				nums[i] = --nums[i];
			}
			
			if(nums[i]%2!=0 &&  i!=0 && nums[i]!=9) {
				nums[i] = ++nums[i];
			}
			
			if(nums[i]==0 && i==0) {
				nums[i] =9;
			}else if(i==0){
				nums[i]=--nums[i];
			}
			
			if(nums[i]==9 && i==0) {
				nums[i] =0;
			}
			
			
			
		}
		
		String output="";
		
		System.out.println(Arrays.toString(nums));
		
		for(int j=0;j<nums.length;j++) {
			
			output+= nums[j];
			
		}
		
		
		
		int num = Integer.parseInt(output);
		return num ;
	
	
	
	

	}
}