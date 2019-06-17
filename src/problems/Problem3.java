package problems;

import utils.Prime;

public class Problem3 {
	public static void main(String args[]) {
		long num = 600851475143l;
		long sqrtX = (long) Math.sqrt(num);
		while (!(num % sqrtX == 0 && Prime.isPrime(sqrtX)))
			sqrtX--;
		System.out.println(sqrtX);
	}
}
