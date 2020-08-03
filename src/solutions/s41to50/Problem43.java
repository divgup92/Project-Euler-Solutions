package solutions.s41to50;

import utils.Permutations;
import utils.Prime;

import java.util.List;

/**
 * Problem 43:
 * <p>
 * The number, 1406357289, is a 0 to 9 pandigital number because it is made up of each of the digits 0 to 9 in some order, but it also has a rather interesting
 * sub-string divisibility property.
 * Let d1 be the 1st digit, d2 be the 2nd digit, and so on. In this way, we note the following:
 * d2d3d4=406 is divisible by 2
 * d3d4d5=063 is divisible by 3
 * d4d5d6=635 is divisible by 5
 * d5d6d7=357 is divisible by 7
 * d6d7d8=572 is divisible by 11
 * d7d8d9=728 is divisible by 13
 * d8d9d10=289 is divisible by 17
 * Find the sum of all 0 to 9 pandigital numbers with this property.
 */

public class Problem43 {

    public static void main(String args[]) throws Exception {
        System.out.println(getRequitedSum());
    }

    private static long getRequitedSum() {
        long sum = 0;
        int[] digits = new int[10];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = i;
        }
        List<Long> pList = Permutations.getAllPermutations(digits, 0, digits.length);
        List<Long> primes = Prime.getPrimesLessThanN(18);
        boolean isInteresting;
        for (Long p : pList) {
            String pStr = String.valueOf(p);
            if (pStr.length() < digits.length)
                continue;
            isInteresting = true;
            for (int i = 0; i < primes.size(); i++) {
                int x = Integer.valueOf(pStr.substring(i + 1, i + 4));
                if ((long) x % primes.get(i) != 0) {
                    isInteresting = false;
                    break;
                }
            }
            if (isInteresting)
                sum += p;
        }
        return sum;
    }

}
