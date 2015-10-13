package kr.co.leehana.solution;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Hana Lee on 2015-10-11 오후 5:29
 *
 * @author {@link "mailto:i@leehana.co.kr" "Hana Lee"}
 * @since 2015-10-11 오후 5:29
 */
public class NthSeriesTest {

	@Test
	public void test1() {
		assertEquals(NthSeries.seriesSum(5), "1.57");
	}
	@Test
	public void test2() {
		assertEquals(NthSeries.seriesSum(9), "1.77");
	}
	@Test
	public void test3() {
		assertEquals(NthSeries.seriesSum(15), "1.94");
	}
	@Test
	public void test4() {
		assertEquals(NthSeries.seriesSum(1), "1.00");
	}
	@Test
	public void test5() {
		assertEquals(NthSeries.seriesSum(0), "0.00");
	}
}