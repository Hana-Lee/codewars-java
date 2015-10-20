package kr.co.leehana.solution;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
public class SearchEngine {
	static int find(String needle, String haystack) {
		// fail code
//		final String[] haystackArray = haystack.replaceAll("[.|,]", "").split(" ");
//		for (String hay : haystackArray) {
//			final int needleLength = needle.length();
//			if (hay.length() == needleLength) {
//				boolean match = true;
//				for (int i = 0; i < needleLength; i++) {
//					final char needleChar = needle.charAt(i);
//					if (needleChar == '_') continue;
//					if (hay.charAt(i) != needleChar) match = false;
//				}
//
//				if (match) {
//					needle = hay;
//					break;
//				}
//			}
//		}
//		return haystack.indexOf(needle);

		String regNeedle = "\\Q" + needle.replaceAll("_", "\\\\E.\\\\Q") + "\\E";
		Matcher m = Pattern.compile(regNeedle).matcher(haystack);
		return m.find() ? m.start() : -1;
	}

	// OverZealous's solution
	static int otherFind(String needle, String haystack) {
		String regNeedle = "\\Q" + needle.replaceAll("_", "\\\\E.\\\\Q") + "\\E";
		Matcher m = Pattern.compile(regNeedle).matcher(haystack);
		if (m.find()) {
			return m.start();
		} else {
			return -1;
		}
	}
}