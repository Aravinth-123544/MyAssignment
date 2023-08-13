package week1day1;

public class Mobile2 {
	public static void main(String[] args) {
        Mobile1 mobile = new Mobile1();

        // Calling the methods
        mobile.sendSMS();
        long phoneNo = mobile.makeCall(9876543210l);
        System.out.println("Returned phone number: " + phoneNo);
    
}



}
