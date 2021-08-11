package week1.day1;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		System.out.println("Sum of digit:" +num);
        int sum = 0;
	
	while((num%10!=0))
		
	{
		
		int mod=num%10;
		sum=sum+mod;
		int div =num/10;
		num=div;
		
		
	}


			System.out.println(sum);

		}

	}


