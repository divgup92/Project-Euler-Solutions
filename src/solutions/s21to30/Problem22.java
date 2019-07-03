package solutions.s21to30;

import java.util.Arrays;

import utils.FileUtils;

public class Problem22 {

	public static void main(String args[]) throws Exception {
		String s = FileUtils.read("p022_names.txt");
		s = s.replace("\"", "");
		String str[] = s.split(",");
		Arrays.sort(str);
		long sumScore = 0;
		for (int i = 0; i < str.length; i++) {
			long score = (i + 1) * getNameWorth(str[i]);
			sumScore += score;
		}
		System.out.println(sumScore);
	}

	private static long getNameWorth(String s) {
		long sum = 0;
		for (int i = 0; i < s.length(); i++)
			sum += s.charAt(i) - 'A' + 1;
		return sum;
	}

}
