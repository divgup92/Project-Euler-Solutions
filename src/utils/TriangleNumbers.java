package utils;

import java.util.ArrayList;
import java.util.List;

public class TriangleNumbers {

	public static List<Long> triangleNumbers(long n) {
		List<Long> nos = new ArrayList<>();
		for (long i = 1; (i * (i + 1)) / 2 <= n; i++) {
			nos.add((i * (i + 1)) / 2);
		}
		return nos;
	}
	
	public static List<Long> triangleNumbersInRange (long n1, long n2) {
		List<Long> nos = new ArrayList<>();
		long i = (-1 + (long)Math.sqrt(1+(8*n1)) )/2;
		for (; (i * (i + 1)) / 2 <= n2; i++) {
			nos.add((i * (i + 1)) / 2);
		}
		return nos;
	}
	
	public static long getTriangleNumberForI(long i) {
		return i*(i+1)/2;
	}
}
