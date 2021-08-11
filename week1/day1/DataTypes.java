package week1.day1;


public class DataTypes {
	String phoneName ="iphone 12";
	float phoneCost=50999.9F;
	boolean isremovableBattery=false;
	Long imeiNum=1234568865476L;
     char Brand='A';
	public void iphone()
	{
		System.out.println("I like my " +phoneName +" and the cost is :" +phoneCost);
		System.out.println("Is iphone has removable battery: " + isremovableBattery  +" and the brand is :" +Brand);
System.out.println("My phone imei is:" +imeiNum);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataTypes obj =new DataTypes();
		obj.iphone();
		

	}

}
