package solutions.s11to20;

import utils.Factors;
import utils.TriangleNumbers;

public class Problem12 {

	public static void main(String args[]) {
		long i=1;
		while(Factors.findSize(TriangleNumbers.getTriangleNumberForI(i))<=500)
			i++;
		System.out.println(TriangleNumbers.getTriangleNumberForI(i));
	}
}
