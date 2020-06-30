package solutions.s31to40;

import java.util.List;

import static utils.Prime.getPrimesLessThanN;

/**
 * Problem 35:
 * <p>
 * The number, 197, is called a circular prime because all rotations of the digits: 197, 971, and 719, are themselves prime.
 * There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.
 * How many circular primes are there below one million?
 */

public class Problem35 {

    public static void main(String args[]) {
        System.out.println(getCountOfCircularPrimesBelowMillion());
    }

    private static int getCountOfCircularPrimesBelowMillion() {
        int count = 0;
        List<Long> primes = getPrimesLessThanN(1000000);
        for (Long prime : primes) {
            if (prime / 10 == 0 || isCircularPrime(prime, primes))
                count++;
        }
        return count;
    }

    private static boolean isCircularPrime(long x, List<Long> primes) {
        String xStr = Long.toString(x);
        for (int i = 0; i < xStr.length() - 1; i++) {
            xStr = xStr.substring(1) + xStr.charAt(0);
            long tempX = Long.valueOf(xStr);
            if (!primes.contains(tempX))
                return false;
        }
        return true;
    }
}
