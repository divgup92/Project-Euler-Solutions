package solutions.s31to40;

import java.util.TreeMap;

/**
 * Problem 39:
 * <p>
 * If p is the perimeter of a right angle triangle with integral length sides, {a,b,c}, there are exactly three solutions for p = 120.
 * {20,48,52}, {24,45,51}, {30,40,50}
 * For which value of p ≤ 1000, is the number of solutions maximised?
 */

public class Problem39 {

    public static void main(String args[]) {
        System.out.println(getPForMaximumSolutions());
    }

    public static int getPForMaximumSolutions() {
        TreeMap<Integer, Integer> pToCountMap = new TreeMap<>();
        for (int i = 1; i < 1000; i++) {
            for (int j = 1; j < 1000; j++) {
                double k = Math.sqrt(i * i + j * j);
                if (k == (int) k) {
                    int p = i + j + (int) k;
                    if (p > 1000)
                        break;
                    if (pToCountMap.get(p) == null)
                        pToCountMap.put(p, 0);
                    pToCountMap.put(p, pToCountMap.get(p) + 1);
                }
            }
        }
        int max = 0, maxP = 0;
        for (Integer p : pToCountMap.keySet()) {
            if (max < pToCountMap.get(p)) {
                max = pToCountMap.get(p);
                maxP = p;
            }
        }
        return maxP;
    }
}
