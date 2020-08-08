package week3.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
	
		String test = "changeme";
		char u='\0';		
		char[] chrArray = test.toCharArray();
		int x = chrArray.length;

		for (int i = 0; i <x; i++) {
        char s = chrArray[i];
		if (i % 2 != 0)
		{
		  	u = Character.toUpperCase(s);
		}
		System.out.print(u);
		}
		
	}

}
