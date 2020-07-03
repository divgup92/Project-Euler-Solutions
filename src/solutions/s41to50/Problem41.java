package solutions.s41to50;

import utils.Prime;

import java.util.ArrayList;
import java.util.List;

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
            List<Long> pList = permutations(digits, n);
            long max = 0;
            for (Long p : pList) {
                if (Prime.isPrime(p) && max < p)
                    max = p;
            }
            if (max != 0)
                return max;
            n--;
        }
    }

    private static List<Long> permutations(int[] array, int end) {
        List<Long> p = new ArrayList<>();
        int[] indexes = new int[end];
        int[] elements = new int[end];
        for (int i = 0; i < end; i++) {
            indexes[i] = 0;
            elements[i] = array[i];
        }

        p.add(formLongFromArray(elements));

        int i = 0;
        while (i < elements.length) {
            if (indexes[i] < i) {
                swap(elements, i % 2 == 0 ? 0 : indexes[i], i);
                p.add(formLongFromArray(elements));
                indexes[i]++;
                i = 0;
            } else {
                indexes[i++] = 0;
            }
        }
        return p;
    }

    private static void swap(int[] input, int a, int b) {
        int tmp = input[a];
        input[a] = input[b];
        input[b] = tmp;
    }

    private static Long formLongFromArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++)
            sb.append(array[i]);
        return Long.valueOf(sb.toString());
    }
}
