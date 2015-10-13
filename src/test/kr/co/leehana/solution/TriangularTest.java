package kr.co.leehana.solution;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Hana Lee on 2015-10-13 오전 9:14
 *
 * @author {@link "mailto:i@leehana.co.kr" "Hana Lee"}
 * @since 2015-10-13 오전 9:14
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
public class TriangularTest {
	@Test
	public void test_One_Should_Be_One() throws Exception {
		assertEquals(1, Triangular.triangular(1));
	}

	@Test
	public void test_Two_Should_Be_Three() throws Exception {
		assertEquals(3, Triangular.triangular(2));
	}

	@Test
	public void test_Three_Should_Be_Six() throws Exception {
		assertEquals(6, Triangular.triangular(3));
	}

	@Test
	public void test_Four_Should_Be_Ten() throws Exception {
		assertEquals(10, Triangular.triangular(4));
	}
}
