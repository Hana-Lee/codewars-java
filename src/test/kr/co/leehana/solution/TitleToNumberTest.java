package kr.co.leehana.solution;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Hana Lee on 2015-10-14 오후 12:29
 *
 * @author {@link "mailto:i@leehana.co.kr" "Hana Lee"}
 * @since 2015-10-14 오후 12:29
 * <p>
 * = Description =
 * Excel sheet column numbers
 * <p>
 * Write a function
 * # titleToNumber(title) or title_to_number(title) or titleToNb title ...
 * <p>
 * (depending on the language)
 * <p>
 * that given a column title as it appears in an Excel sheet, returns its corresponding column number.
 * All column titles will be uppercase.
 */
public class TitleToNumberTest {
	@Test
	public void test1() {
		assertEquals(1, TitleToNumber.titleToNumber("A"));
	}

	@Test
	public void test2() {
		assertEquals(27, TitleToNumber.titleToNumber("AA"));
	}

	@Test
	public void test3() {
		assertEquals(52, TitleToNumber.titleToNumber("AZ"));
	}

	@Test
	public void test4() {
		assertEquals(53, TitleToNumber.titleToNumber("BA"));
	}

	@Test
	public void test5() {
		assertEquals(28779382963L, TitleToNumber.titleToNumber("CODEWARS"));
	}
}
