package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates2 {

	public static void main(String[] args) {
		
		String str = "we are here to learn java energy";

		String[] words = str.split("\\s");
		int len = words.length;
		System.out.println(len);
		
		for (String eachVal : words) {
			System.out.println(eachVal + " ");
		}
		
		Set<String> values = new LinkedHashSet<String>(); 
		for (String e : values) {
			System.out.println(values.add(e));
		}
	
		System.out.println(values);
		
	}
	

}
