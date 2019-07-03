package solutions.s21to30;

import java.util.List;

import utils.Factors;

public class Problem21 {

	public static void main(String args[]) {
		int sum = 0;
		boolean x[] = new boolean[10000];
		x[0]=x[1]=true;
		for (int i = 2; i < 10000; i++) {
			if(x[i]==true)
				continue;
			int s = getSumOfDivisors(i);
			if (i!=s && i == getSumOfDivisors(s)) {
				sum+=i+s;
				x[i] = x[s] = true;
			}
		}
		System.out.println(sum);
	}

	public static int getSumOfDivisors(int num) {
		List<Long> f = Factors.find(num);
		f.remove(Long.valueOf(num));
		int sum = 0;
		for (Long x : f)
			sum += x;
		return sum;
	}

}
