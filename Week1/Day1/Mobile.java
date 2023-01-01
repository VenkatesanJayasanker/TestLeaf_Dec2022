// Assignment - 2

package Week1.Day1;

public class Mobile {
	
	public void makeCall() {
		String mobileModel = "Iphone 13";
		float mobileWeight = 187.56f;
		System.out.println("Mobile model is : "+mobileModel);
	}
	
	public void sendSms() {
		boolean isFullyCharged = true;
		int mobileCost = 82000;
		
		System.out.println("Cost of Phone is : "+mobileCost);
	}

	

	public static void main(String[] args) {
		Mobile mob = new Mobile();
		mob.makeCall();
		mob.sendSms();
	}

}
