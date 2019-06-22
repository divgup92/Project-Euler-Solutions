package solutions.s1to10;

public class Problem2 {
	
	public static void main(String args[]) {
		System.out.println(sumOfEvenFib(4000000l));
	}

	public static long sumOfEvenFib(long x) {
		long sum = 2;
		long a = 1;
		long b = 2;
		long c = a + b;
		while (c < x) {
			c = a + b;
			if (c % 2 == 0)
				sum += c;
			a = b;
			b = c;
		}
		return sum;
	}
}
