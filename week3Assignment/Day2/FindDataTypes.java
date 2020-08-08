package week3.day2;

public class FindDataTypes {

	public static void main(String[] args) {
		// Here is the input
		String test = "$$% Welcome to 22nd Class of Automa tion $$ ";
		
		char[] chrArray = test.toCharArray();
		
		int letter = 0, space =0, num =0, specialChar=0;
		
		int y = chrArray.length;

		for (int i = 0; i<=y-1; i++) {
         
			char s = chrArray[i];
			if(Character.isDigit(s)== true)
			{
				num = num +1;
			}
			else if ((Character.isLetter(s)== true))
			{
				letter = letter + 1;
			}
			
			else if ((Character.isSpaceChar(s)== true))
			{
				space = space + 1;
			}
			else
			{
				specialChar = specialChar + 1;
			}
		}
		
		System.out.println("letter " + letter);
		System.out.println("Numbers " + num);
		System.out.println("space " + space);
		System.out.println("Special character " + specialChar);
		
		
	}

}
