package utils;

import java.util.ArrayList;
import java.util.List;

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
}
