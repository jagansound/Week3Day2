package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class PrintDuplicatesInArray {
  public static void main(String[] args) {	
	  
	  int[] input = { 14, 12, 13, 11, 15, 14, 18, 16, 19, 18, 17, 20 };
	  
	  LinkedHashSet<Integer> linkedhashset = new LinkedHashSet<Integer>();
	  
	  for (int i=0;i<input.length;i++) {
		  for (int j=0;j<input.length;j++ ) {
			if (i!=j)  {
				if (input[i] == input[j]) {
						linkedhashset.add(input[i]);
					}
				}
			}
	  	 }
	System.out.println(linkedhashset);
  }
 
}
