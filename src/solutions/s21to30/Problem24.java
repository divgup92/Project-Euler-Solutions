package solutions.s21to30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import utils.Factorial;

public class Problem24 {

	public static void main(String args[]) {
		int limit = 1000000;
		List<Character> digits = new ArrayList<>(
				Arrays.asList(new Character[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' }));
		String s = "";
		for (int i = 9; i >= 0; i--) {
			int x = 0;
			int fact = (int) Factorial.getLong(i);
			while (limit > fact) {
				limit -= fact;
				x++;
			}
			s += Integer.toString(digits.get(x) - '0');
			digits.remove(x);
		}
		System.out.println(s);
	}

}
