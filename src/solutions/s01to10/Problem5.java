package solutions.s01to10;

import java.util.*;

import utils.Prime;

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
