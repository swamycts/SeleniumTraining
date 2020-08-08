package week3.day2;

public class ReverseString {

	public static void main(String[] args) {
	String test = "feeling good";
	
	char[] charArray = test.toCharArray();
    int strLength = charArray.length;

    for (int i = strLength-1; i>=0; i--) {
	 	System.out.print(charArray[i]);
    	}
	
    System.out.println();
        //another method to reverse string
        int x = test.length();
    for (int j=x-1; j>=0; j--){
    
    	System.out.print(test.charAt(j));
    }
    
	}

}
