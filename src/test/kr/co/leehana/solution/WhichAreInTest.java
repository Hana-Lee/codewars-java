package kr.co.leehana.solution;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Hana Lee on 2015-10-24 22:01
 *
 * @author Hana Lee
 * @since 2015-10-24 22:01
 * = Description =
 * Which are in?
 *
 * Given two arrays of strings a1 and a2 return a sorted array in lexicographical order and without
 * duplicates of the strings of a1 which are substrings of strings of a2.
 *
 * Example: a1 = ["arp", "live", "strong"]
 *
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 *
 * returns ["arp", "live", "strong"]
 *
 * a1 = ["tarp", "mice", "bull"]
 *
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 *
 * returns []
 *
 * Note: Arrays are written in "general" notation. See "Your Test Cases" for examples in your language.
 */
public class WhichAreInTest {
	@Test
	public void test1() {
		String a[] = new String[]{ "arp", "live", "strong" };
		String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
		String r[] = new String[] { "arp", "live", "strong" };
		assertArrayEquals(r, WhichAreIn.inArray(a, b));
	}

	@Test
	public void test2() {
		String a[] = new String[]{ "tarp", "mice", "bull" };
		String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
		String r[] = new String[] {};
		assertArrayEquals(r, WhichAreIn.inArray(a, b));
	}
}
