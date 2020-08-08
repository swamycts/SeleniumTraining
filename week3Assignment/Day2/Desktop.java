package week3.day2;

public class Desktop implements Hardware, Software {

	public static void main(String[] args) {
Desktop desk = new Desktop();
desk.softwareResources();
desk.hardwareResources();

	}

	public void softwareResources() {
		System.out.println("software resources");		
		
	}

	public void hardwareResources() {
		System.out.println("hardware resources");
	}
}

