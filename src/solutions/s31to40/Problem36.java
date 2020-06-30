package solutions.s31to40;

/**
 * Problem 36:
 * <p>
 * The decimal number, 585 = 10010010012 (binary), is palindromic in both bases.
 * Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.
 * (Please note that the palindromic number, in either base, may not include leading zeros.)
 */
public class Problem36 {

    public static void main(String args[]) {
        System.out.println(getRequiredSum());
    }

    private static long getRequiredSum() {
        long sum = 0;
        for(int i=1;i<1000000;i++) {
            String iStrBase10 = Integer.toString(i);
            String iStrBase2 = Integer.toBinaryString(i);
            if(isPalindrome(iStrBase10) && isPalindrome(iStrBase2))
                sum+=i;
        }
        return sum;
    }

    private static boolean isPalindrome(String x) {
        String revX = new StringBuilder(x).reverse().toString();
        if (revX.equals(x))
            return true;
        return false;
    }

}
