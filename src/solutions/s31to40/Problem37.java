package solutions.s31to40;

import utils.Prime;

import java.util.List;

/**
 * Problem 37:
 * <p>
 * The number 3797 has an interesting property. Being prime itself, it is possible to continuously remove digits from left to right,
 * and remain prime at each stage: 3797, 797, 97, and 7. Similarly we can work from right to left: 3797, 379, 37, and 3.
 * Find the sum of the only eleven primes that are both truncatable from left to right and right to left.
 * NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.
 */

public class Problem37 {
    public static void main(String args[]) {
        System.out.println(getRequiredSum());
    }

    private static long getRequiredSum() {
        long sum = 0;
        List<Long> primes = Prime.getPrimesLessThanN(1000000);
        System.out.println(primes);
        for (Long prime : primes) {
            if (prime / 10 != 0 && isTruncablePrime(prime, primes))
                sum += prime;
        }
        return sum;
    }

    private static boolean isTruncablePrime(long prime, List<Long> primes) {
        String primeStr = Long.toString(prime);
        for (int i = 1; i < primeStr.length(); i++) {
            String temp = primeStr.substring(i);
            String temp1 = primeStr.substring(0, primeStr.length() - i);
            if (!primes.contains(Long.valueOf(temp)) || !primes.contains(Long.valueOf(temp1)))
                return false;
        }
        return true;
    }

}
