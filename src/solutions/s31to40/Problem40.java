package solutions.s31to40;

/**
 * Problem 40:
 *
 * An irrational decimal fraction is created by concatenating the positive integers:
 * 0.123456789101112131415161718192021...
 * It can be seen that the 12th digit of the fractional part is 1.
 * If dn represents the nth digit of the fractional part, find the value of the following expression.
 * d1 × d10 × d100 × d1000 × d10000 × d100000 × d1000000
 */

public class Problem40 {

    public static void main(String args[]) {
        System.out.println(getProductDigits());
    }

    private static int getProductDigits() {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while (true) {
            sb.append(i++);
            if (sb.length() > 1000000)
                break;
        }
        String s = sb.toString();
        return (s.charAt(0) - '0') * (s.charAt(9) - '0') * (s.charAt(99) - '0') * (s.charAt(999) - '0') * (s.charAt(9999) - '0') *
                (s.charAt(99999) - '0') * (s.charAt(999999) - '0');
    }
}
