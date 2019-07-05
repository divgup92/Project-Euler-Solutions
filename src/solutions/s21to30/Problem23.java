package solutions.s21to30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import utils.Factors;

public class Problem23 {

	private static List<Long> abundant = new ArrayList<>();
	private static final int MAX_LIMIT = 28123;
	
	public static void main(String args[]) {
		long sum = 0;
		populateAbundantNumbersLessThan(MAX_LIMIT);
		Set<Long> set = new HashSet<>();
		for(int i=0;i<abundant.size();i++) {
			for(int j=0;j<abundant.size();j++) {
				set.add(abundant.get(i)+abundant.get(j));
			}
		}
		for(int i=1;i<MAX_LIMIT;i++) {
			if(!set.contains(Long.valueOf(i))) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	public static void populateAbundantNumbersLessThan(int n) {
		for (long i = 12; i <= n; i++) {
			long sum = Factors.findSum(i) - i;
			if (sum > i)
				abundant.add(i);
		}
	}

}
