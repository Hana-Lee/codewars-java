package kr.co.leehana.solution;

import java.util.stream.IntStream;

/**
 * Created by Hana Lee on 2015-10-22 18:49
 *
 * @author Hana Lee
 * @since 2015-10-22 18:49
 *
 * = Description =
 *
 * Multiples of 3 and 5
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 *
 * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
 * Courtesy of ProjectEuler.net
 */
public class MultiplesSolution {
	public int solution(int number) {
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}

		return sum;
	}

	// flekken's solution
	public int otherSolution1(int number) {
		return IntStream.range(0, number).filter(n -> (n % 3 == 0) || (n % 5 == 0)).sum();
	}

	/*
	    The sum of multiples of 3 is 3 + 6 + 9 + ... = 3 (1+2+3+...)
	    The sum of mulitples of 5 is 5 + 10 + 15 + ... = 5 (1+2+3+...)
	    If we just sum these, we'll get double values when a number is divisble by both,
	    so we substract the sum of multiples of 15, which is obtained in a similar manner.
	    The upper bound cannot be floor function because the inputed number shouldn't count.

	    Lazar95's solution
	*/
	public int otherSolution2(int n) {
		int a = (int) Math.ceil(n/3d) - 1;
		int b = (int) Math.ceil(n/5d) - 1;
		int c = (int) Math.ceil(n/15d) - 1;
		return (3 * a * (a+1) + 5 * b * (b+1) - 15 * c * (c + 1)) / 2;
	}
}
