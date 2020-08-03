package solutions.s41to50;

import java.util.List;

import static utils.Prime.isPrime;
import static utils.Permutations.getAllPermutations;

/**
 * Problem 41:
 * <p>
 * We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once. For example, 2143 is a
 * 4-digit pandigital and is also prime.
 * What is the largest n-digit pandigital prime that exists?
 */

public class Problem41 {

    public static void main(String args[]) {
        System.out.println(largestPandigitalPrime());
    }

    private static long largestPandigitalPrime() {
        int[] digits = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = 9;
        while (true) {
            List<Long> pList = getAllPermutations(digits, 0, n);
            long max = 0;
            for (Long p : pList) {
                if (isPrime(p) && max < p)
                    max = p;
            }
            if (max != 0)
                return max;
            n--;
        }
    }
}
