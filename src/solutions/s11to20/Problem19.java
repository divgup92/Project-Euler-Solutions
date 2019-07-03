package solutions.s11to20;

import java.util.Calendar;

public class Problem19 {

	public static void main(String args[]) {
		int count = 0;
		for (int year = 1901; year < 2001; year++) {
			for (int month = 0; month < 12; month++) {
				Calendar c = Calendar.getInstance();
				c.set(year, month, 1);
				if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
					count++;
			}
		}
		System.out.println(count);
	}

}
