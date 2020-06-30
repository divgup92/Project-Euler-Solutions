package solutions.s31to40;

/**
 * Problem 38:
 * <p>
 * Take the number 192 and multiply it by each of 1, 2, and 3:
 * 192 × 1 = 192
 * 192 × 2 = 384
 * 192 × 3 = 576
 * By concatenating each product we get the 1 to 9 pandigital, 192384576. We will call 192384576 the concatenated product of 192 and (1,2,3)
 * The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4, and 5, giving the pandigital, 918273645,
 * which is the concatenated product of 9 and (1,2,3,4,5).
 * What is the largest 1 to 9 pandigital 9-digit number that can be formed as the concatenated product of an integer with (1,2, ... , n)
 * where n > 1?
 */
public class Problem38 {

    public static void main(String args[]) {
        System.out.println(getGreatestPandigitalNumber());
    }

    private static long getGreatestPandigitalNumber() {
        long max = 0;
        for (long i = 2; i < 10000L; i++) {
            StringBuilder productSum = new StringBuilder(Long.toString(i));
            int j = 2;
            for (; j < 6; j++) {
                if (productSum.length() >= 9)
                    break;
                productSum.append(j * i);
            }

            if (j>2 && hasAllDigits(productSum.toString())) {
                long current = Long.valueOf(productSum.toString());
                if (max < current)
                    max = current;
            }
        }
        return max;

    }

    private static boolean hasAllDigits(String product) {
        String expected = "123456789";
        if (product.length() > 9)
            return false;
        for (int i = 0; i < expected.length(); i++) {
            if (!product.contains(Character.toString(expected.charAt(i))))
                return false;
        }
        return true;
    }

}
