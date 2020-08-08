package week3.day2;

public class CharOccurance {

	public static void main(String[] args) {

            String str = "welcome to cheeeei";
            int a = 0 ;
            char[] charArray = str.toCharArray();
            
            for (int i = 0; i <= charArray.length-1; i++) {
            if(charArray[i] == 'e')
            {
            	a = a+1;
            }
		}
           System.out.println("the occurances of 'e' character is " + a);
	
	
	}
	

}
