package solutions.s31to40;

/**
 * Problem: 34
 * <p>
 * 145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
 * Find the sum of all numbers which are equal to the sum of the factorial of their digits.
 * Note: as 1! = 1 and 2! = 2 are not sums they are not included.
 */
public class Problem34 {

    public static void main(String args[]) {
        System.out.println(getSumRequired());
    }

    private static int getSumRequired() {
        int[] factorials = new int[10];
        fillFactorials(factorials);
        int sum = 0;
        for (int i = 3; i < 100000; i++) {
            if (i == getSumOfFactorialsOfDigits(i, factorials))
                sum += i;
        }
        return sum;
    }

    private static void fillFactorials(int[] factorials) {
        int f = 1;
        factorials[0] = factorials[1] = 1;
        for (int i = 2; i < factorials.length; i++) {
            factorials[i] = factorials[i - 1] * i;
        }
    }

    private static int getSumOfFactorialsOfDigits(int x, int[] factorials) {
        String xStr = Integer.toString(x);
        int sum = 0;
        for (int i = 0; i < xStr.length(); i++) {
            sum += factorials[xStr.charAt(i) - '0'];
        }
        return sum;
    }
}
