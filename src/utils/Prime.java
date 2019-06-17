package utils;

public class Prime {
	
	public static boolean isPrime(long n) {
		if(n<=1)
			return false;
		if(n==2 || n==3 || n==5)
			return true;
		if(n%2==0 || n%3==0 || n%5==0)
			return false;
		for(int i=1;(6*i)+5<n && (6*i)+1<n;i++) {
			if(n%((6*i)+5) == 0 || n%((6*i)+1) == 0)
				return false;
		}
		return true;
	}
}
