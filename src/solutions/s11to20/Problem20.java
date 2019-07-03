package solutions.s11to20;

import java.math.BigInteger;

import utils.Factorial;

public class Problem20 {

	public static void main(String args[]) {
		BigInteger f = Factorial.getBI(100);
		String fStr = f.toString();
		int sum = 0;
		for(int i=0;i<fStr.length();i++) {
			sum += fStr.charAt(i) - '0';
		}
		System.out.println(sum);
	}
	
}
