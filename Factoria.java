package week1.day1;

public class Factoria {

	int x = 5;
	int fact = 1;
	
	public void caldecrement() {
			
		for (int i=5;i>=0;--i){
			System.out.println(i);
		}
		
	}
	
	public void calFactorial()
	{
		
		for (int i=1; i<=x; i++)
		{
			fact=fact*i;
			if (i==x)
			{
				System.out.println(fact);
	
			}
					}
	}
		
						
	public static void main(String[] args) {

		Factoria f = new Factoria();
	//	f.caldecrement();
		f.calFactorial();
	}

}
