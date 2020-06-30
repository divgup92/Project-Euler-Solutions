package solutions.s01to10;

import utils.Prime;

/**
 * Problem 3:
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

public class Problem3 {
	public static void main(String args[]) {
		long num = 600851475143l;
		long sqrtX = (long) Math.sqrt(num);
		while (!(num % sqrtX == 0 && Prime.isPrime(sqrtX)))
			sqrtX--;
		System.out.println(sqrtX);
	}
}
