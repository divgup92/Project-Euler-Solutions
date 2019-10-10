package solutions.s21to30;

public class Problem30 {

	private static int powersArray[] = new int[10];

	public static void main(String args[]) {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			powersArray[i] = (int) Math.pow(i, 5);
		}
		for (int i = 0; i < 10; i++) {
			for (int i1 = 0; i1 < 10; i1++) {
				for (int i2 = 0; i2 < 10; i2++) {
					for (int i3 = 0; i3 < 10; i3++) {
						for (int i4 = 0; i4 < 10; i4++) {
							for (int i5 = 0; i5 < 10; i5++) {
								int num = 100000 * i + 10000 * i1 + 1000 * i2 + 100 * i3 + 10 * i4 + i5;
								int sumPower = powersArray[i] + powersArray[i1] + powersArray[i2] + powersArray[i3]
										+ powersArray[i4] + powersArray[i5];
								if (num == sumPower) {
									sum += sumPower;
									System.out.println(num);
								}
							}
						}
					}
				}
			}
		}
		System.out.println(sum - 1);
	}
}
