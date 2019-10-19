package utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NumberDigit {
	public static List<Character> getDigits(String n) {
		List<Character> digits = new LinkedList<>();
		for (int i = 0; i < n.length(); i++)
			digits.add(n.charAt(i));
		return digits;
	}

	public static boolean haveCommonDigit(int a, int b, int noDigits) {
		if (getCommonDigits(a, b).size() >= noDigits)
			return true;
		return false;
	}

	public static List<Integer> getCommonDigits(int a, int b) {
		List<Integer> list = new ArrayList<>();
		String aStr = Integer.toString(a);
		String bStr = Integer.toString(b);
		for (int i = 0; i < aStr.length(); i++) {
			if (bStr.indexOf(aStr.charAt(i)) >= 0)
				list.add(Integer.valueOf(Character.toString(aStr.charAt(i))));
		}
		return list;
	}
}
