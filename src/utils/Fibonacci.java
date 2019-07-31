package utils;

import java.math.BigInteger;

public class Fibonacci {
	
	public static int getIndexOfFibWithDigits(int n) {
		BigInteger a,b;
		a = b = BigInteger.ONE;
		BigInteger c = a.add(b);
		int index = 3;
		while(c.toString().length() != n) {
			a = b;
			b = c;
			c = a.add(b);
			index++;
		}
		return index;
	}
	
}
