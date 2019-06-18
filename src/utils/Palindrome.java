package utils;

public class Palindrome {
	public static boolean isPalindrome(String s) {
		if (s.equals(new StringBuilder(s).reverse().toString()))
			return true;
		return false;
	}
}
