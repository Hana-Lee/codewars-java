package kr.co.leehana.solution;

/**
 * Created by Hana Lee on 2015-10-14 오후 12:28
 *
 * @author {@link "mailto:i@leehana.co.kr" "Hana Lee"}
 * @since 2015-10-14 오후 12:28
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
public class TitleToNumber {

	public static long titleToNumber(String title) {
		long titleNum = 0;

		long multiplier = 1;
		for (int i = title.length() - 1; i >= 0; i--) {
			char character = title.charAt(i);

			long valChar = ((int) character) - '@';
			titleNum += (multiplier * valChar);
			multiplier *= 26;
		}

		return titleNum;
	}

	private static final String alpha = "_ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	// http://www.codewars.com/users/Azuaron
	public static long titleToNumber1(String title) {
		return title.length() == 0 ? 0 : (long) (alpha.indexOf(title.charAt(0)) * Math.pow(26, title.length() - 1)) +
				titleToNumber(title.substring(1));
	}

	// http://www.codewars.com/users/andric.iv
	public static long titleToNumber2(String title) {
		//The title number to be returned
		long titleNum = 0;

		//if title is null or empty return 0
		if (null == title || title.isEmpty()) {
			return titleNum;
		}

		long multiplier = 1;
		for (int i = title.length() - 1; i >= 0; i--) {
			char character = title.charAt(i);

			long valChar = ((int) character) - 64;
			titleNum += (multiplier * valChar);
			multiplier *= 26;
		}

		return titleNum;
	}
}
