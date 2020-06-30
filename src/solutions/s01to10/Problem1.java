package solutions.s01to10;

/**
 * Problem 1:
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class Problem1 {

    public static void main(String args[]) {
        System.out.println(sumOfMultiples3Or5(1000));
    }

    public static long sumOfMultiples3Or5(long x) {
        long sum = 0;
        for (long i = 3l; i < x; i += 3) {
            sum += i;
        }
        for (long i = 5l; i < x; i += 5) {
            if (i % 3 != 0) {
                sum += i;
            }
        }
        return sum;
    }

}