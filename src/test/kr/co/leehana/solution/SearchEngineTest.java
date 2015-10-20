package kr.co.leehana.solution;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Hana Lee on 2015-10-20 오후 3:36
 *
 * @author {@link "mailto:i@leehana.co.kr" "Hana Lee"}
 * @since 2015-10-20 오후 3:36
 * <p>
 * = Description =
 * <p>
 * String searching with wildcard
 * <p>
 * The method below, is the most simple string search algorithm.
 * It will find the first occurrence of a word in a text string.
 * <p>
 * haystack = the whole text
 * needle = searchword
 * wildcard = _
 * <p>
 * # find("strike", "i will strike down upon thee"); // return 7
 * <p>
 * The find method is already made.
 * <p>
 * The problem is to implement wildcard(s) in the needle.
 * If you have a _ in the needle it will match any character in the haystack.
 * <p>
 * A normal string search algorithm will find the first occurrence of a word(needle) in a text(haystack),
 * starting on index 0. Like this:
 * <p>
 * # find("strike", "I will strike down upon thee"); return 7
 * <p>
 * A wildcard in the needle will match any character in the haystack. The method should work on any types of needle,
 * and haystasks. You can assume the needle is shorter than(or equal to) the haystack.
 * <p>
 * # find("g__d", "That's the good thing about being president"); // return 11
 * <p>
 * If no match the method should return -1
 */
public class SearchEngineTest {

	private String haystack = "Once upon a midnight dreary, while I pondered, weak and weary, port";

	@Test
	public void normalSearchTest() {
		assertEquals(0, SearchEngine.find("Once", haystack));
		assertEquals(12, SearchEngine.find("midnight", haystack));
		assertEquals(-1, SearchEngine.find("codewars", haystack));
	}

	@Test
	public void wildSearchTest() {
		assertEquals(5, SearchEngine.find("_po_", haystack));
		assertEquals(12, SearchEngine.find("_idnight", haystack));
		assertEquals(29, SearchEngine.find("w___e", haystack));
		assertEquals(5, SearchEngine.find("u_o_", haystack));
		assertEquals(47, SearchEngine.find("_e_k", haystack));
	}
}