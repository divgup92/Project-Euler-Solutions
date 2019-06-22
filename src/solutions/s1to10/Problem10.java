package solutions.s1to10;

import utils.Prime;

public class Problem10 {

	public static void main(String args[]) {
		long sum = 0l;
		for(int i=2;i<2000000;i++) {
			if(Prime.isPrime(i))
				sum+=i;
		}
		System.out.println(sum);
	}
	
}
