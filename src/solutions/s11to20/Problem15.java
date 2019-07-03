package solutions.s11to20;

public class Problem15 {

	private static long a[][] = new long[21][21];

	public static void main(String args[]) {
		a[0][0] = 0;
		for (int i = 2; i <= 21; i++)
			fillMatrix(i);
		System.out.println(a[20][20]);
	}

	public static void fillMatrix(int pos) {
		int x = 1, y = 1;
		a[0][pos - 1] = a[pos - 1][0] = 1;
		while (x < pos && y < pos) {
			a[x][pos - 1] = a[x - 1][pos - 1] + a[x][pos - 2];
			a[pos - 1][y] = a[pos - 1][y - 1] + a[pos - 2][y];
			x++;
			y++;
		}
	}

}
