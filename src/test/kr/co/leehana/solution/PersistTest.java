package kr.co.leehana.solution;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
public class PersistTest {
	@Test
	public void BasicTest1() {
		assertEquals(3, Persist.persistence(39));
	}

	@Test
	public void BasicTest2() {
		assertEquals(0, Persist.persistence(4));
	}

	@Test
	public void BasicTest3() {
		assertEquals(2, Persist.persistence(25));
	}

	@Test
	public void BasicTest4() {
		assertEquals(4, Persist.persistence(999));
	}
}
