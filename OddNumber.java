package week1.day1;

public class OddNumber {

	int num = 20;
	
	public void modfunction()
	{
		int x = 9;
	    int y = 2;
	    System.out.println(x % y);
	}
	
	
	public void printOdd() {
		
		for (int i = 1; i<=num; i++) {

			if (i%2 !=  0) {
				
				System.out.println(i);
		      }
		}

	}
	
	
		public static void main(String[] args) {
		
		OddNumber Odd1 = new OddNumber();
		Odd1.printOdd();
		
		//Odd1.modfunction();
		
	}

}
