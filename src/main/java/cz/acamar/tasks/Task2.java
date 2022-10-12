package cz.acamar.tasks;

import java.util.Arrays;

public class Task2 {

	/**
	 * Task 2. Squares of a sorted array.
	 * <p>
	 * Given an integer array sorted in non-decreasing order,
	 * return an array of the squares of each number sorted in non-decreasing order.
	 * <p>
	 * Example input: [-4,-1,0,3,10]
	 * Expected output: [0,1,9,16,100]
	 * <p>
	 * Explanation: After squaring, the array becomes [16,1,0,9,100].
	 * After sorting, it becomes [0,1,9,16,100].
	 *
	 * @param input - an integer array sorted in non-decreasing order
	 * @return - an array of the squares of each number sorted in non-decreasing order
	 */
	public int[] squaresOfSortedArray(int[] input) {
		if (input == null || input.length == 0) {
			return input;
		}
		int[] result = new int[input.length];
		for (int i = 0; i < input.length; ++i) {
			result[i] = input[i] * input[i];
		}
		Arrays.sort(result);
		return result;
	}

	public int[] squaresOfSortedArrayManualSort(int[] input) {
		if (input == null || input.length == 0) {
			return input;
		}
		int[] result = new int[input.length];
		int negativeIndex = 0;
		final int lastIndex = input.length - 1;
		for (; input[negativeIndex] < 0; ++negativeIndex) {
			result[lastIndex - negativeIndex] = input[negativeIndex] * input[negativeIndex];
		}

		final int firstNegativeNumberIndex = lastIndex - negativeIndex + 1;

		for (int i = negativeIndex; i <= lastIndex; ++i) {
			result[i - negativeIndex] = input[i] * input[i];
		}

		for (int i = firstNegativeNumberIndex; i <= lastIndex; ++i) {
			var index = 0;
			for (; index <= lastIndex; ++index) {
				if (result[i] < result[index]) {
					break;
				}
			}
			if (index <= lastIndex) {
				var tmp = result[i];
				for (int j = i; j > index; --j) {
					result[j] = result[j - 1];
				}
				result[index] = tmp;
			} else {
				break;
			}
		}
		return result;
	}

}
