package cz.acamar.tasks;

public class Task1 {

	/**
	 * Task 1. Length of the last word.
	 * <p>
	 * Given a string s consisting of some words separated by some number of spaces,
	 * return the length of the last word in the string.
	 * <p>
	 * A word is a maximal substring consisting of non-space characters only.
	 * <p>
	 * Example input: "Hello World"
	 * Expected output: 5
	 *
	 * @param str - a string s consisting of some words separated by some number of spaces.
	 * @return - the length of the last word in the string.
	 */
	public int lengthOfLastWord(String str) {
		int result = 0;
		if (str != null && !str.isBlank()) {
			var words = str.split("\\s+");
			result = words[words.length - 1].length();
		}
		return result;
	}
}
