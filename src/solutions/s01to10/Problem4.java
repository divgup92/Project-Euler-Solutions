package solutions.s01to10;

import utils.Palindrome;

public class Problem4 {

	public static void main(String args[]) {
		boolean flag = false;
		for (int i = 999; i > 900; i--) {
			for (int j = 999; j > 900; j--)
				if (Palindrome.isPalindrome(Integer.toString(i * j))) {
					System.out.println(i * j);
					flag = true;
				}
			if (flag)
				break;
		}

	}

}
