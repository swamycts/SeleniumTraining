package week3.day1;

public class SmartPhone extends AndriodPhone {

	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone();
		sp.connecWhatsApp();
		sp.takeVideo();
		sp.sendMsg();
		sp.makeCall();
		sp.saveContact();

	}

	public void connecWhatsApp()
	{
		System.out.println("watsapp connected");
	}
	
	public void takeVideo() {
	      System.out.println("video taken in child smart");
		}
}
