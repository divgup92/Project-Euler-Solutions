package solutions.s21to30;

import java.util.HashSet;

public class Problem26 {

	public static void main(String[] args) {
		int maxCycles = Integer.MIN_VALUE, maxElement = 1;
		for (int i = 1; i <= 1000; i++) {
			int cyclesI = getReciprocalCycleLength(i);
			if (cyclesI > maxCycles) {
				maxCycles = cyclesI;
				maxElement = i;
			}
		}
		System.out.println(maxElement);
	}

	public static int getReciprocalCycleLength(int x) {
		HashSet<Integer> remainderSet = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		String resultStr = new String();
		int remainder = 1 % x;
		int quotient = 1 / x;
		while (true) {
			quotient = (remainder * 10) / x;
			if (remainderSet.contains(remainder)) {
				int index = sb.indexOf(Integer.toString(quotient));
				resultStr = sb.substring(0, index) + "(" + sb.substring(index) + ")";
				break;
			} else {
				remainderSet.add(remainder);
				remainder = (remainder * 10) % x;
				sb.append(quotient);
			}
		}

		return resultStr.indexOf(')') - resultStr.indexOf('(') - 1;
	}

}
