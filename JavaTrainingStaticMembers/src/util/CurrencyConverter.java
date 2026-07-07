package util;

public class CurrencyConverter {

	public static double converter(double dollarPrice, double dollarAmount) {
		
		double tax = 6.0/100.0;
		double result = (dollarPrice * dollarAmount);
		result += result * tax;
		
		return result;
	}

}
