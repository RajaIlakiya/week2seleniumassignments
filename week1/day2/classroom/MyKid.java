package week1.day2.classroom;

public class MyKid {


		String phoneName ="iphone 12";
		float phoneCost=50999.9F;
		boolean isremovableBattery=false;
		Long imeiNum=1234568865476L;
	    char logo='A';
		  public void iphone()
		{
			System.out.println("I like my " +phoneName +" and the cost is :" +phoneCost);
			System.out.println("Is iphone has removable battery: " + isremovableBattery  +" and the brand is :" +logo);
	System.out.println("My phone imei is:" +imeiNum);
		}
		  public void calls()
		  {
			  System.out.println("make calls");
		  }

		  private void payMoney()
		  {
			  System.out.println("make payments");
		  }
	    
}
