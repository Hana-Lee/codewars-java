package kr.co.leehana.solution;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Hana Lee on 2015-10-15 오후 5:43
 *
 * @author {@link "mailto:i@leehana.co.kr" "Hana Lee"}
 * @since 2015-10-15 오후 5:43
 * <p>
 * * = Description =
 * <p>
 * Find the smallest integer in the array
 * <p>
 * Given an array of integers your solution should find the smallest integer. For example:
 * # Given [34, 15, 88, 2] your solution will return 2
 * # Given [34, -345, -1, 100] your solution will return -345
 * <p>
 * You can assume, for the purpose of this kata, that the supplied array will not be empty.
 */
public class SmallestIntegerFinderTest {
	@Test
	public void example1() {
		int expected = 11;
		int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78, 56, 232, 12, 11, 43});
		assertEquals(expected, actual);
	}


	@Test
	public void example2() {
		int expected = -33;
		int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78, 56, -2, 12, 8, -33});
		assertEquals(expected, actual);
	}

	@Test
	public void example3() {
		int expected = Integer.MIN_VALUE;
		int actual = SmallestIntegerFinder.findSmallestInt(new int[]{0, Integer.MIN_VALUE, Integer.MAX_VALUE});
		assertEquals(expected, actual);
	}
}
