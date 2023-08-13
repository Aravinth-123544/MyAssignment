package week1day1;

public class Mobiles {
	boolean isFullcharged;
	int mobilecase;
	
	
	public void makeCall() {
		System.out.println("calling");
		
	}
	public void sendMsg() {
		System.out.println("sending a message");
		
	}
	public static void main(String[] args) {
		Mobiles mobiles= new Mobiles() ;
		System.out.println("This my mobile");
		
		mobiles.makeCall();
		mobiles.sendMsg();
	}

}
