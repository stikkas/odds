package cz.acamar.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Task2Tests {

	private Task2 task2 = new Task2();

	@Test
	void test_case1() {
		int[] input = new int[]{-4, -1, 0, 3, 10};
		int[] expected = new int[]{0, 1, 9, 16, 100};

		assertArrayEquals(expected, task2.squaresOfSortedArray(input));
	}

	@Test
	void test_case2() {
		int[] input = new int[]{-7, -3, 2, 3, 11};
		int[] expected = new int[]{4, 9, 9, 49, 121};

		assertArrayEquals(expected, task2.squaresOfSortedArray(input));
	}

	@Test
	void test_case3() {
		int[] input = new int[]{};

		assertTrue(task2.squaresOfSortedArray(input).length == 0);
	}

	@Test
	void test_case4() {
		assertNull(task2.squaresOfSortedArray(null));
	}
}
