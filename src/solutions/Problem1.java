package solutions;

public class Problem1 {

	public static void main(String args[]) {
		System.out.println(sumOfMultiples3Or5(1000));
	}

	public static long sumOfMultiples3Or5(long x) {
		long sum = 0;
		for (long i = 3l; i < x; i += 3) {
			sum += i;
		}
		for (long i = 5l; i < x; i += 5) {
			if (i % 3 != 0) {
				sum += i;
			}
		}
		return sum;
	}
	
}