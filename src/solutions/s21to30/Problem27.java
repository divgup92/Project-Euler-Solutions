package solutions.s21to30;

import java.util.List;

import utils.Prime;

public class Problem27 {

	private static int max = Integer.MIN_VALUE;
	private static long a_val, b_val;

	public static void main(String[] args) {
		List<Long> primes = Prime.getPrimesLessThanNSeive(1000);
		for (long a : primes) {
			for (long b : primes) {
				calculateNumberOfPrimes(a, b);
				calculateNumberOfPrimes(a, -1 * b);
				calculateNumberOfPrimes(-1 * a, b);
				calculateNumberOfPrimes(-1 * a, -1 * b);
			}
		}
		System.out.println(a_val * b_val);
	}

	public static void calculateNumberOfPrimes(long a, long b) {
		int count = 0;
		for (int i = 0; Prime.isPrime(i * i + i * a + b); i++)
			count++;
		if (count > max) {
			max = count;
			a_val = a;
			b_val = b;
		}
	}
}
