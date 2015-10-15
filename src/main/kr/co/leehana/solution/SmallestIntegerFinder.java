package kr.co.leehana.solution;

import java.util.stream.IntStream;

/**
 * Created by Hana Lee on 2015-10-15 오후 5:43
 *
 * @author {@link "mailto:i@leehana.co.kr" "Hana Lee"}
 * @since 2015-10-15 오후 5:43
 * <p>
 * = Description =
 * <p>
 * Find the smallest integer in the array
 * <p>
 * Given an array of integers your solution should find the smallest integer. For example:
 * # Given [34, 15, 88, 2] your solution will return 2
 * # Given [34, -345, -1, 100] your solution will return -345
 * <p>
 * You can assume, for the purpose of this kata, that the supplied array will not be empty.
 */
public class SmallestIntegerFinder {
	public static int findSmallestInt(int[] args) {
		quickSort(args, 0, args.length - 1);
		return args[0];
	}

	private static void quickSort(int[] values, int leftIndex, int rightIndex) {
		int index = partition(values, leftIndex, rightIndex);
		if (leftIndex < index - 1) quickSort(values, leftIndex, index - 1);
		if (index < rightIndex) quickSort(values, index, rightIndex);
	}

	private static int partition(int arr[], int left, int right) {
		int i = left, j = right;
		int tmp;
		int pivot = arr[(left + right) / 2];

		while (i <= j) {
			while (arr[i] < pivot) i++;
			while (arr[j] > pivot) j--;
			if (i <= j) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		}
		;

		return i;
	}

	// acaccia, aNNiMON, vercruyssetim, JoseDeniz, simps90's solution
	public static int otherFindSmallestInt(int[] args) {
		return IntStream.of(args).min().getAsInt();
	}

	//rghossi's solution
	public static int otherFindSmallestInt2(int[] args) {
		int smallest = Integer.MAX_VALUE;
		for (int i : args)
			smallest = (smallest > i) ? i : smallest;
		return smallest;
	}
}
