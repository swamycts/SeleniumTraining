package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {

	public static void main(String[] args) {
		String input[] = {"HCL", "Wipro", "Aspire", "CTS"};
		
		List<String> values = new ArrayList<String>();
		
		//System.out.println(input[1]);
	
		/*values.add(input[0]);
		values.add(input[1]);
		values.add(input[2]);
		values.add(input[3]);

		//System.out.println(values.size());
		
		Collections.sort(values);
	System.out.println(values);*/
	
	
	//another method programatically
	
		//1st for loop to add the array in the List
		
	for(String eachInput : input){
      values.add(eachInput);		
	}

	Collections.sort(values);
	
	for(String eachVal : values)
	{
		System.out.println(eachVal);
	}
	
}
}