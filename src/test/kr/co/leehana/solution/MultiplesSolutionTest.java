package kr.co.leehana.solution;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Hana Lee on 2015-10-22 18:50
 *
 * @author Hana Lee
 * @since 2015-10-22 18:50
 *
 * = Description =
 *
 * Multiples of 3 and 5
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 *
 * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
 * Courtesy of ProjectEuler.net
 */
public class MultiplesSolutionTest {
	@Test
	public void test() {
		assertEquals(23, new MultiplesSolution().solution(10));
	}
}
