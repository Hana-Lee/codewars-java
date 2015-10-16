package kr.co.leehana.solution;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Hana Lee on 2015-10-16 오후 2:55
 *
 * @author {@link "mailto:i@leehana.co.kr" "Hana Lee"}
 * @since 2015-10-16 오후 2:55
 *
 * = Description =
 *
 * CompoundArray
 *
 * You have to create a method "compoundArray" which should take as input two int
 * arrays of different length and return one int array with numbers of both arrays shuffled one by one.
 *
 * # Example: Input - {1,2,3,4,5,6} and {9,8,7,6} Output - {1,9,2,8,3,7,4,6,5,6}
 */
public class CompoundArrayTest {
	@Test
	public void test1() {
		assertArrayEquals(new int[]{1, 9, 2, 8, 3, 7, 4, 6, 5, 6}, CompoundArray.compoundArray(new int[]{1, 2, 3, 4,
				5, 6}, new int[]{9, 8, 7, 6}));
	}

	@Test
	public void test2() {
		assertArrayEquals(new int[]{0, 9, 1, 8, 2, 7, 6, 5, 4, 3, 2, 1, 0}, CompoundArray.compoundArray(new int[]{0,
				1, 2}, new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}));
	}
}
