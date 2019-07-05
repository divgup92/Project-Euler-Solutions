package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Factors {

	public static List<Long> find(long number) {
		List<Long> factors = new ArrayList<>();
		factors.add(1l);
		factors.add(number);
		for(long i=2;i<number;i++) {
			if(number%i==0)
				factors.add(i);
		}
		return factors;
	}
	
	public static int findSize(long number) {
		int count = 2;
		for(int i=2;i*i<number;i++) {
			if(number%i==0)
				count++;
		}
		return 2*count;
	}
	
	public static long findSum(long n) {
		Map<Long, Long> primeFactorMap = Prime.getPrimefactorMap(n);
		long sum = 1;
		for(Long p: primeFactorMap.keySet()) {
			sum *= (Math.pow(p, primeFactorMap.get(p)+1)-1)/(p-1);
			//System.out.println(p +" "+primeFactorMap.get(p)+" "+sum+" "+(Math.pow(p, primeFactorMap.get(p)-1))+" "+(p-1));
		}
		return sum;
	}
}
