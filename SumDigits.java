package week1.day1;

public class SumDigits {

	int num = 12223;
	int sum = 0;
	
	public void division() {
	//	System.out.println("equivalent " + num / 10);
	//  System.out.println("reminder " + num % 10);
		
	}
	
	public void doSum() {
				
		while (num != 0) {
        
			sum = sum + num % 10;
			num = num/10;
			
			}
		    
		System.out.println(sum);
		}
		
		
	
	public static void main(String[] args) {
		
		SumDigits sd = new SumDigits();
		sd.doSum();
		//sd.division();

	}

}
