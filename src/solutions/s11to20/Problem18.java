package solutions.s11to20;

public class Problem18 {
	
	private static final int SIZE = 15;
	
	private static int a[][] = {{75},
								{95,64},
								{17,47,82},
								{18,35,87,10},
								{20,04,82,47,65},
								{19,01,23,75,03,34},
								{88,02,77,73,07,63,67},
								{99,65,04,28,06,16,70,92},
								{41,41,26,56,83,40,80,70,33},
								{41,48,72,33,47,32,37,16,94,29},
								{53,71,44,65,25,43,91,52,97,51,14},
								{70,11,33,28,77,73,17,78,39,68,17,57},
								{91,71,52,38,17,14,91,43,58,50,27,29,48},
								{63,66,04,68,89,53,67,30,73,16,69,87,40,31},
								{04,62,98,27,23,9,70,98,73,93,38,53,60,04,23}};
	
	//private static int a[][] = {{3},{7,4},{2,4,6},{8,5,9,3}};
	
	public static void main(String args[]) {
		int sum[][] = new int[SIZE][SIZE];
		sum[0][0] = a[0][0];
		for(int i=1;i<SIZE;i++) 
			sum[i][0] = sum[i-1][0]+a[i][0];
		for(int i=1;i<SIZE;i++) {
			for(int j=1;j<=i;j++) {
				if(sum[i-1][j-1]>sum[i-1][j])
					sum[i][j] = sum[i-1][j-1] + a[i][j];
				else {
					sum[i][j] = sum[i-1][j] + a[i][j];
				}
			}
		}
		int max=0;
		for(int j=0;j<SIZE;j++)
			if(max<sum[SIZE-1][j])
				max = sum[SIZE-1][j];
		System.out.println(max);
	}
}
