package solutions.s01to10;

import utils.Prime;

/**
 * Problem 10:
 *
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */

public class Problem10 {

	public static void main(String args[]) {
		long sum = 0l;
		for(int i=2;i<2000000;i++) {
			if(Prime.isPrime(i))
				sum+=i;
		}
		System.out.println(sum);
	}
	
}
