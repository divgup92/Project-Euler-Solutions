package solutions.s31to40;

import static utils.Euclidean.gcd;
import static utils.NumberDigit.*;

public class Problem33 {

	public static void main(String args[]) {
		System.out.println(getDigitCancellingFractions());
	}

	private static int getDigitCancellingFractions() {
		int prodNum = 1, prodDen = 1;
		for (int i = 11; i < 100; i++) {
			for (int j = 11; j < 100; j++) {
				if (i % 10 == 0 || j % 10 == 0 || i >= j || !haveCommonDigit(i, j, 1))
					continue;
				int gcd = gcd(i, j);
				int commonDigit = getCommonDigits(i, j).get(0);
				int iDig = getOtherDigit(i, commonDigit);
				int jDig = getOtherDigit(j, commonDigit);
				int gcdDig = gcd(iDig, jDig);
				if (i / gcd == iDig / gcdDig && j / gcd == jDig / gcdDig) {
					prodDen *= jDig / gcdDig;
					prodNum *= iDig / gcdDig;
				}
			}
		}
		return prodDen / gcd(prodNum, prodDen);
	}

	private static int getOtherDigit(int a, int d) {
		String aStr = Integer.toString(a);
		int d2 = Integer.valueOf(Character.toString(aStr.charAt((aStr.indexOf(Integer.toString(d)) + 1) % 2)));
		return d2;
	}
}
