package kr.co.leehana.solution;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Hana Lee on 2015-10-21 오후 5:01
 *
 * @author {@link "mailto:i@leehana.co.kr" "Hana Lee"}
 * @since 2015-10-21 오후 5:01
 *
 * = Description =
 * Are they the "same"?
 *
 * Given two arrays a and b write a function comp(a, b) (compSame(a, b) in Clojure) that checks whether
 * the two arrays have the "same" elements, with the same multiplicities. "Same" means, here, that the elements
 * in b are the elements in a squared, regardless of the order.
 *
 * Examples
 *
 * Valid arrays
 *
 * # a = [121, 144, 19, 161, 19, 144, 19, 11]
 * # b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]
 *
 * comp(a, b) returns true because in b 121 is the square of 11, 14641 is the square of 121, 20736 the square of 144,
 * 361 the square of 19, 25921 the square of 161, and so on.
 * It gets obvious if we write b's elements in terms of squares:
 *
 * # a = [121, 144, 19, 161, 19, 144, 19, 11]
 * # b = [11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19]
 *
 * Invalid arrays
 * If we change the first number to something else, comp may not return true anymore:
 *
 * # a = [121, 144, 19, 161, 19, 144, 19, 11]
 * # b = [132, 14641, 20736, 361, 25921, 361, 20736, 361]
 *
 * comp(a,b) returns false because in b 132 is not the square of any number of a.
 *
 * # a = [121, 144, 19, 161, 19, 144, 19, 11]
 * # b = [121, 14641, 20736, 36100, 25921, 361, 20736, 361]
 *
 * comp(a,b) returns false because in b 36100 is not the square of any number of a.
 *
 * Remarks
 *
 * a or b might be [] or nil (Ruby) or null (JS) or None (Python).
 *
 * If a or b are nil (or null or None), the problem doesn't make sense so return false.
 *
 * If a or b are empty the result is evident by itself.
 */
public class AreSame {
	public static boolean comp(int[] a, int[] b) {
		if (a == null || b == null || a.length != b.length) return false;
		boolean result = true;
		for (int target : b) {
			double temp = Math.pow(target, 0.5);
			boolean subResult = false;
			for (int source : a) {
				if (temp == source) {
					subResult = true;
					break;
				}
			}

			if (!subResult) {
				result = false;
				break;
			}
		}

		return result;
	}

	// xehpuk's solution
	public static boolean otherComp(final int[] a, final int[] b) {
		return a != null && b != null && a.length == b.length &&
				Arrays.equals(
						Arrays.stream(a).map(i -> i * i).sorted().toArray(),
						Arrays.stream(b).sorted().toArray()
				);
	}
}
