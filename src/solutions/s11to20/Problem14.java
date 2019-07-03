package solutions.s11to20;

public class Problem14 {

	private static long a[] = new long[1000000];

	public static void main(String args[]) {
		a[1] = 1;
		int maxPos = 1;
		for (int i = 2; i < 1000000; i++) {
			a[i] = getCollatzSize(i);
			if(a[maxPos]<a[i]) 
				maxPos=i;
		}
		System.out.println(maxPos);
	}

	public static long getCollatzSize(long i1) {
		int i = (int)i1;
		if (i1<1000000l && a[i] != 0)
			return a[i];
		if (i1 % 2 == 0)
			return getCollatzSize(i1 / 2) + 1;
		return getCollatzSize(3 * i1 + 1) + 1;
	}
}
