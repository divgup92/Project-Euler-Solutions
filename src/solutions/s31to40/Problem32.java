package solutions.s31to40;

import java.util.*;
import static utils.NumberDigit.getDigits;

public class Problem32 {

	public static void main(String[] args) {
		Set<Integer> pandigital = new HashSet<>();
		Set<Character> digitsSet = new HashSet<>();
		List<Character> digits = new LinkedList<>();
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			String iStr = Integer.toString(i);
			if (iStr.indexOf("0") >= 0)
				continue;
			for (int j = 111; j < 10000; j++) {
				digits.clear();
				digitsSet.clear();
				String jStr = Integer.toString(j);
				if (jStr.indexOf("0") >= 0)
					continue;
				digits.addAll(getDigits(iStr));
				digits.addAll(getDigits(jStr));
				int prod = i * j;
				String prodStr = Integer.toString(prod);
				if (prodStr.indexOf("0") >= 0)
					continue;
				digits.addAll(getDigits(prodStr));
				digitsSet.addAll(digits);
				if (digits.size() == 9 && digitsSet.size() == 9) {
					pandigital.add(prod);
				}
			}
		}
		for (Integer i : pandigital) {
			sum += i;
		}
		System.out.println(sum);

	}

}
