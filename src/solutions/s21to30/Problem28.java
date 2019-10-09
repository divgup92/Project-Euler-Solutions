package solutions.s21to30;

public class Problem28 {

	public static void main(String args[]) {
		long sum = 1, k = 2, cur = 1;
		for (int i = 0; i < 1001 / 2; i++) {
			for (int j = 0; j < 4; j++) {
				cur += k;
				sum += cur;
			}
			k += 2;
		}
		System.out.println(sum);
	}
}
