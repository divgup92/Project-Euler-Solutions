package solutions.s31to40;

import java.util.Arrays;
import java.util.List;

public class Problem31 {

	public static void main(String[] args) {
		List<Integer> coins = Arrays.asList(1, 2, 5, 10, 20, 50, 100, 200);
		System.out.println(getNumberOfWays(coins, 200));
	}

	private static int getNumberOfWays(List<Integer> coins, int amount) {
		int ways[][] = new int[coins.size()][amount + 1];
		for (int i = 0; i < coins.size(); i++) {
			ways[i][0] = 1;
		}
		for (int j = 1; j <= amount; j++) {
			ways[0][j] = 1;
		}
		for (int i = 1; i < coins.size(); i++) {
			for (int j = 1; j <= amount; j++) {
				if (j >= coins.get(i))
					ways[i][j] = ways[i - 1][j] + ways[i][j - coins.get(i)];
				else
					ways[i][j] = ways[i - 1][j];
			}
		}
		return ways[coins.size() - 1][amount];
	}

}
