package kr.co.leehana.solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Hana Lee on 2015-10-19 오후 6:12
 *
 * @author {@link "mailto:i@leehana.co.kr" "Hana Lee"}
 * @since 2015-10-19 오후 6:12
 * <p>
 * = Description =
 * Help the bookseller !
 * <p>
 * A bookseller has lots of books classified in 26 categories labeled A, B, ... Z. Each book has a code c of 3, 4, 5
 * or more capitals letters. The 1st letter of a code is the capital letter of the book category.
 * In the bookseller's stocklist each code c is followed by a space and by a positive integer n (int n >= 0)
 * which indicates the quantity of books of this code in stock.
 * <p>
 * In a given stocklist all codes have the same length and all numbers have their own same length
 * (can be different from the code length).
 * <p>
 * For example an extract of one of the stocklists could be:
 * # L = {"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"}.
 * <p>
 * In this stocklist all codes have a length of five and all numbers have a length of two.
 * <p>
 * You will be given a stocklist (e.g. : L) and a list of categories in capital letters e.g :
 * # M = {"A", "B", "C", "W"}
 * <p>
 * and your task is to find all the books of L with codes belonging to each category of M and to sum their quantity
 * according to each category. You will have first to determine the common length of the codes and the common
 * length of the quantities in L.
 * <p>
 * For the lists L and M of example you have to return the string (in Haskell/Clojure a list of pairs):
 * # (A : 20) - (B : 114) - (C : 50) - (W : 0)
 * <p>
 * where A, B, C, W are the categories, 20 is the sum of the unique book of category A, 114 the sum
 * corresponding to "BKWRK" and "BTSQZ", 50 corresponding to "CDXEF" and 0 to category 'W' since there are no code
 * beginning with W.
 * <p>
 * If L or M are empty return string is "" (Clojure should return an empty array instead).
 */
public class StockList {
	// 1st parameter is the stocklist (L in example),
	// 2nd parameter is list of categories (M in example)
	public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
		String result = "";
		int count = 0;
		boolean emptyResult = true;
		for (String letter : lstOf1stLetter) {
			int sum = 0;
			for (String art : lstOfArt) {
				String[] artArray = art.split(" ");
				String title = artArray[0];
				int price = Integer.parseInt(artArray[1]);

				if (title.startsWith(letter)) {
					sum += price;
				}
			}

			if (sum > 0)
				emptyResult = false;

			result += String.format("(%s : %d)", letter, sum);
			count++;
			if (count < lstOf1stLetter.length && result.length() > 0)
				result += " - ";
		}
		return emptyResult ? "" : result;
	}

	// Abbe's solution
	private static class Book {
		public final String category;
		public final String code;
		public final int quantity;

		public Book(String label) {
			category = label.substring(0,1);
			code = label.split(" ")[0].substring(1);
			quantity = Integer.parseInt(label.split(" ")[1]);
		}
	}

	public static String otherStockSummary1(String[] lstOfArt, String[] lstOf1stLetter) {
		if (lstOfArt.length == 0 || lstOf1stLetter.length == 0)
			return "";
		Map<String, Integer> categoryCounts = Arrays.stream(lstOfArt)
				.map(Book::new)
				.collect(Collectors.groupingBy(book -> book.category, Collectors.summingInt(book -> book.quantity)));
		return Arrays.stream(lstOf1stLetter)
				.map(initial -> String.format("(%s : %d)",
						initial, categoryCounts.getOrDefault(initial, 0)))
				.collect(Collectors.joining(" - "));
	}

	// mstream's solution
	public static String otherStockSummary2(String[] lstOfArt, String[] lstOf1stLetter) {
		if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
			return "";
		}
		Map<String, Integer> map = new HashMap(lstOf1stLetter.length);
		for (String book : lstOfArt) {
			String category = book.substring(0, 1);
			Integer quantity = Integer.valueOf(book.substring(book.indexOf(" ") + 1));
			if (!map.containsKey(category)) {
				map.put(category, quantity);
			} else {
				map.put(category, quantity + map.get(category));
			}
		}
		StringBuilder sb = new StringBuilder();
		Iterator<String> it = Arrays.asList(lstOf1stLetter).iterator();
		while(it.hasNext()) {
			String category = it.next();
			int quantity = map.containsKey(category) ? map.get(category) : 0;
			sb.append(String.format("(%s : %d)", category, quantity));
			if (it.hasNext()) {
				sb.append(" - ");
			}
		}
		return sb.toString();
	}
}
