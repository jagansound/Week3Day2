/***
 * /*
	 * Pseudo code 
	 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 
	 * g) Displaying the String without duplicate words	
	 */

package week3.day2;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week3";
		LinkedHashSet<String> linkedset = new LinkedHashSet<String>();
		String[] words = text.split("\\s");
		int length = words.length;
		for (int i = 0; i < length; i++) {
			linkedset.add(words[i]);
		}
		System.out.println(linkedset);
	}
}
