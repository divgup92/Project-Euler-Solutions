package solutions.s01to10;

/**
 * Problem 2:
 *
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */

public class Problem2 {
	
	public static void main(String args[]) {
		System.out.println(sumOfEvenFib(4000000l));
	}

	public static long sumOfEvenFib(long x) {
		long sum = 2;
		long a = 1;
		long b = 2;
		long c = a + b;
		while (c < x) {
			c = a + b;
			if (c % 2 == 0)
				sum += c;
			a = b;
			b = c;
		}
		return sum;
	}
}
