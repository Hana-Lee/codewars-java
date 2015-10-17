package kr.co.leehana.solution;

/**
 * Created by Hana Lee on 2015-10-17 22:30
 *
 * @author Hana Lee
 * @since 2015-10-17 22:30
 *
 * = Description =
 *
 * Persistent Bugger.
 *
 * Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
 * which is the number of times you must multiply the digits in num until you reach a single digit.
 *
 * For example:
 *
 * # persistence(39) == 3  // because 3*9 = 27, 2*7 = 14, 1*4=4 and 4 has only one digit
 *
 * # persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2
 *
 * # persistence(4) == 0   // because 4 is already a one-digit number
 */
public class Persist {
	public static int persistence(long n) {
		int result = 0;
		while (n > 9) {
			long multi = 1;
			for (char t : String.valueOf(n).toCharArray()) {
				multi *= Long.parseLong(String.valueOf(t));
			}
			n = multi;
			result++;
		}
		return result;
	}

	// ra1nar, andrey91's solution
	public static int otherPersistence(long n) {
		long m = 1, r = n;

		if (r / 10 == 0)
			return 0;

		for (r = n; r != 0; r /= 10)
			m *= r % 10;

		return persistence(m) + 1;
	}
}
