package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		String str = "1bb2";
		String revStr = "";
		
		int x = str.length();
        System.out.println(x);
 
      
    	for (int i = x-1; i >=0; i--) {
			revStr = revStr + str.charAt(i);
	    	}

    	if(str.equals(revStr))
    	{
    		System.out.println("given string is a palindrome");
    	}
    	else
    		System.out.println("Its is not a palindrome");
    	
	}

}
