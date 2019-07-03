package solutions.s11to20;

public class Problem17 {

	// { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
	private static final int digitStrLen[] = { 3, 3, 5, 4, 4, 3, 5, 5, 4 };
	// { "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
	private static final int tensStrLen[] = { 3, 6, 6, 5, 5, 5, 7, 6, 6 };
	// { "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
	private static final int teensStrLen[] = { 6, 6, 8, 8, 7, 7, 9, 8, 8 };
	private static final int hundred = "hundred".length();
	private static final int and = "and".length();
	private static final int thousand = "thousand".length();

	public static void main(String args[]) {
		long sum = 0;
		for (int i = 1; i <= 1000; i++) {
			sum += getLengthNumber(i);
		}
		System.out.println(sum);
	}

	public static int getLengthNumber(int num) {
		if (num == 0)
			return 0;
		if (num < 10)
			return digitStrLen[num - 1];
		if (num < 100 && num % 10 == 0)
			return tensStrLen[num / 10 - 1];
		if (num > 10 && num < 20)
			return teensStrLen[num % 10 - 1];
		if (num < 100 && num > 20)
			return tensStrLen[num / 10 - 1] + getLengthNumber(num % 10);
		if (num < 1000 && num >= 100)
			return digitStrLen[num / 100 - 1] + hundred + (num % 100 == 0 ? 0 : and) + getLengthNumber(num % 100);
		return (digitStrLen[0] + thousand);
	}

}
