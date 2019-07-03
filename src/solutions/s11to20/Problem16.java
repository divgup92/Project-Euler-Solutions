package solutions.s11to20;

import java.math.BigInteger;

public class Problem16 {

	public static void main(String args[]) {
		String s = new BigInteger("2").pow(1000).toString();
		long sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum += s.charAt(i) - '0';
		}
		System.out.println(sum);
	}

}
