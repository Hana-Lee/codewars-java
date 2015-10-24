package kr.co.leehana.solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Hana Lee on 2015-10-24 22:01
 *
 * @author Hana Lee
 * @since 2015-10-24 22:01
 *
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
public class WhichAreIn {
	public static String[] inArray(String[] array1, String[] array2) {
		Set<String> result = new HashSet<>();

		for(String a1 : array1) {
			for(String a2 : array2) {
				if(a2.contains(a1)) {
					result.add(a1);
					break;
				}
			}
		}

		String[] resultArray = result.toArray(new String[result.size()]);

		Arrays.sort(resultArray);

		return resultArray;
	}

	// student003's solution
	public static String[] otherInArray(String[] array1, String[] array2) {
		return Arrays.stream(array1)
				.filter(str ->
						Arrays.stream(array2).anyMatch(s -> s.contains(str)))
				.distinct()
				.sorted()
				.toArray(String[]::new);
	}
}
