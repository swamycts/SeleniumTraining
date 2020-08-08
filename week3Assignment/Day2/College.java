package week3.day2;

public class College extends University {

public void UG() {
		System.out.println("UG is implemented in College class");

	}
	
	
	public static void main(String[] args) {
		
		College mycollege = new College();
		mycollege.pg();
		mycollege.UG();

		
	}

}
