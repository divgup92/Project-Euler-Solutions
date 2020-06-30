package solutions.s01to10;

import java.util.*;

import utils.Prime;

/**
 * Problem 5:
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class Problem5 {
	
	public static void main(String argsp[]) {
		LinkedList<Integer> list = new LinkedList<>();
		int prod = 1;
		for (int i = 20; i >= 2; i--) {
			int num = i;
			for (Integer x : list) {
				if (num % x == 0)
					num /= x;
			}
			list.addAll(Prime.getPrimefactorisation(num));
		}
		for (Integer x : list) {
			prod *= x;
		}
		System.out.println(prod);
	}
	
}
