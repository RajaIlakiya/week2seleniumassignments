package week1.day2.assignment1;

public class MyCalculator {
	public static void main(String[] args) {
		Calculator calc = new Calculator();

		System.out.println(calc.add(20, 10, 40));
		System.out.println(calc.sub(30, 10));
		System.out.println(calc.mul(125.50, 5.0));
		System.out.println(calc.divide(100.50F, 100.50F));

	}

}
