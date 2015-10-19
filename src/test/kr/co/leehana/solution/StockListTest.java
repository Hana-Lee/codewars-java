package kr.co.leehana.solution;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Hana Lee on 2015-10-19 오후 6:12
 *
 * @author {@link "mailto:i@leehana.co.kr" "Hana Lee"}
 * @since 2015-10-19 오후 6:12
 *
 * = Description =
 * Help the bookseller !
 *
 * A bookseller has lots of books classified in 26 categories labeled A, B, ... Z. Each book has a code c of 3, 4, 5
 * or more capitals letters. The 1st letter of a code is the capital letter of the book category.
 * In the bookseller's stocklist each code c is followed by a space and by a positive integer n (int n >= 0)
 * which indicates the quantity of books of this code in stock.
 *
 * In a given stocklist all codes have the same length and all numbers have their own same length
 * (can be different from the code length).
 *
 * For example an extract of one of the stocklists could be:
 * # L = {"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"}.
 *
 * In this stocklist all codes have a length of five and all numbers have a length of two.
 *
 * You will be given a stocklist (e.g. : L) and a list of categories in capital letters e.g :
 * # M = {"A", "B", "C", "W"}
 *
 * and your task is to find all the books of L with codes belonging to each category of M and to sum their quantity
 * according to each category. You will have first to determine the common length of the codes and the common
 * length of the quantities in L.
 *
 * For the lists L and M of example you have to return the string (in Haskell/Clojure a list of pairs):
 * # (A : 20) - (B : 114) - (C : 50) - (W : 0)
 *
 * where A, B, C, W are the categories, 20 is the sum of the unique book of category A, 114 the sum
 * corresponding to "BKWRK" and "BTSQZ", 50 corresponding to "CDXEF" and 0 to category 'W' since there are no code
 * beginning with W.
 *
 * If L or M are empty return string is "" (Clojure should return an empty array instead).
 */
public class StockListTest {
	@Test
	public void test1() {
		String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
		String cd[] = new String[] {"A", "B"};
		assertEquals("(A : 200) - (B : 1140)",
				StockList.stockSummary(art, cd));
	}

//	@Test
//	public void test2() {
//		String art[] = new String[]{"ABAR 200", "CDXE 500", "KKWR 250", "TTSQ 890", "ZRTY 600"};
//		String cd[] = new String[] {"B", "R", "D", "X"};
//		assertEquals("(B : 0) - (R : 0) - (D : 0) - (X : 0)",
//				StockList.stockSummary(art, cd));
//	}
}
