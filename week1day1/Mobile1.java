package week1day1;

public class Mobile1 {
	 public void sendSMS() {
	 System.out.println("Sending SMS from Oppo");
	 }


public long makeCall(long phoneNumber) {
   
    return phoneNumber;
}
	
public static void main(String[] args) {
    // Creating an object of the Mobile class
    Mobile1 mobile = new Mobile1();

    // Calling the methods
    mobile.sendSMS();
    long phoneNo = mobile.makeCall(1234567890);
    System.out.println("Returned phone number: " + phoneNo);
}
}
