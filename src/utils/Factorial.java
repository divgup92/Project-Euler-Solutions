package utils;

import java.math.BigInteger;

public class Factorial {

	public static long getLong(int num) {
		long f = 1;
		for (long i = 2; i <= num; i++) {
			f *= i;
		}
		return f;
	}

	public static BigInteger getBI(int num) {
		BigInteger f = BigInteger.ONE;
		for (int i = 2; i <= num; i++) {
			f = f.multiply(BigInteger.valueOf(i));
		}
		return f;
	}

}
