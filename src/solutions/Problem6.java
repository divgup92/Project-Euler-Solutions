package solutions;

public class Problem6 {

	public static void main(String args[]) {
		long sum = 0, sumSq = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			sumSq += i * i;
		}
		System.out.println((sum * sum) - sumSq);
	}

}
