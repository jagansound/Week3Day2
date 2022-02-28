package week3.day2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {3,2,11,4,6,7};
		
		ArrayList<Integer> values = new ArrayList<Integer>();
		
		for(Integer i : data) {
			  values.add(i);
		}
		
		System.out.println("Print the list of values:"+ values);
		
		Collections.sort(values);
		System.out.println("Print the list of Sorted values:"+ values);
		System.out.println("Print the Second largest number in the List:"+ values.get(values.size()-2));
		

	}

}
