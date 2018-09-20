/*
 * jeremy
 */

public class CalcApp
{
	public static void main(String[] args)
	{
		Calculator thisCalculator = new Calculator();
		int minuend = 10;
		int subtrahend = 6;
		int diff = thisCalculator.subtract(10,6);
		System.out.println("The difference of " + minuend + " and " + subtrahend + " is: " + diff);
	}
}
