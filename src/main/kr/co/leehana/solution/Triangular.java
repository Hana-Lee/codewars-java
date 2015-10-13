package kr.co.leehana.solution;

import java.util.stream.IntStream;

/**
 * Created by Hana Lee on 2015-10-13 오전 9:12
 *
 * @author {@link "mailto:i@leehana.co.kr" "Hana Lee"}
 * @since 2015-10-13 오전 9:12
 *
 * = Description =
 *
 * # Triangular Treasure
 *
 * Triangular numbers are so called because of the equilateral triangular shape that they occupy when laid out as dots. i.e.
 *
 * # 1st (1)   2nd (3)    3rd (6)
 *   *         **         ***
 *             *          **
 *                        *
 *
 * You need to return the nth triangular number. You should return 0 for out of range values:
 */
public class Triangular {
	public static int triangular(int n) {
		int result = 0;
		for (int i = 1; i <= n; i++) {
			result += i;
		}
		return result;
	}

	// JulianNicholls, SithFire, MountainMatt, jkalliga, DeanWay 's solution - best practice
	public static int otherTriangular(int n) {
		return (n <= 0) ? 0 : n * (n + 1) / 2;
	}

	// Khui, bali182 's solution - jdk 1.8
	public static int otherTriangular2(int n) {
		return IntStream.range(1, n + 1).sum();
	}
}
