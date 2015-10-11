package kr.co.leehana.solution;

/**
 * Created by Hana Lee on 2015-10-11 17:25
 *
 * @author Hana Lee
 * @since 2015-10-11 17:25
 *
 *
 * = Description =
 *
 * <a href="http://www.codewars.com/kata/555eded1ad94b00403000071/train/java"></a>
 *
 * 7 kyu - Sum of the first nth term of Series
 *
 * Task:
 * Your task is to write a function which returns the sum of following series upto nth term(parameter).
 * ex) Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
 *
 * Rules:
 * # You need to round the answer upto 2 decimal places and return it as String.
 * # If the given value is 0 then it should return 0.00
 * # You will only be given Natural Numbers as arguments.
 *
 * Examples:
 * # SeriesSum(1) => 1 = "1"
 * # SeriesSum(2) => 1 + 1/4 = "1.25"
 * # SeriesSum(5) => 1 + 1/4 + 1/7 + 1/10 + 1/13 = "1.57"
 *
 */

public class NthSeries {

	public static String seriesSum(int n) {
		float result = 1.0f;
		float baseNum = 1.0f;
		if (n <= 0) result = 0;
		else {
			for (int i = 1; i < n; i++) {
				baseNum = baseNum + 3;
				result += 1.0 / baseNum;
			}
		}
		return String.format("%.2f", result);
	}

	// ptrgags, Jabell's solution
	public static String bestSolution(int n) {
		double sum = 0.0;
		for (int i = 0; i < n; i++)
			sum += 1.0 / (1 + 3 * i);

		return String.format("%.2f", sum);
	}
}
