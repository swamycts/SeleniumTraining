package week3.day1;

public class Calculator {
	
	public void add(int a, int b)
	{
		System.out.println(a + b);
	}
	
	public void add(int x, int y, int z)
	{
		System.out.println(x+y+z);
	}
	
	public void multiply(int s, int t)
	{
		System.out.println(s * t);
	
	}
	
	public void multiply(int o, double d)
	{
	System.out.println(o*d);
	}
	
	public void subtract(int x, int y) 
	{
	
System.out.println(x-y);
	}
	public void subtract(double a, double b) 
	{
	System.out.println(a-b);

	}

	public void divide(int i, int j) 
	{
	System.out.println(i/j);

	}
	

	public void divide(double a, int b) 
	{
	System.out.println(a/b);

	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(2, 3);
		calc.add(3, 4, 5);
		
		calc.multiply(2, 3.4);
		calc.multiply(50, 4);

		calc.subtract(3.5, 5.7);
		calc.subtract(56, 28);
		
		calc.divide(3.5, 1);
		calc.divide(48, 2);
		
	}

}
