package week1day1;

public class Mobile {
    String mobileModel;
    float mobileWeight;
    boolean isFullCharged;
    int mobileCost;

    public void makeCall(String number) {
        mobileModel = "Samsung Galaxy S21";
        mobileWeight = 0.17f;
        System.out.println("Making call to " + number + " on " + mobileModel + " (weight: " + mobileWeight + " kg)...");
    }

    public void sendMsg(String number, String message) {
        isFullCharged = true;
        mobileCost = 10000;
        System.out.println("Sending message '" + message + "' to " + number + " (cost: Rs. " + mobileCost + ")...");
    }

    public static void main(String[] args) {
        Mobile myMobile = new Mobile();
        System.out.println("This is my mobile:");
        myMobile.makeCall("555-1234");
        myMobile.sendMsg("555-1234", "Hello, how are you?");
    }

		
		
		
	}
	
