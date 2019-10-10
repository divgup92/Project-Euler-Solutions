package solutions.s21to30;

import java.util.HashSet;
import java.util.Set;

public class Problem29 {

	public static void main(String[] args) {

		Set<Double> allPowers = new HashSet<>();
		for (int a = 2; a <= 100; a++)
			for (int b = 2; b <= 100; b++)
				allPowers.add(Math.pow(a, b));
		
		System.out.println(allPowers.size());

	}

}
