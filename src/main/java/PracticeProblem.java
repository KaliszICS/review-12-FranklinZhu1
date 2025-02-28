public class PracticeProblem {

	public static boolean isPalindrome(String word) {
		word = word.toLowerCase().strip();
		if (word.equals("")) return true;
		int i = 0;
		int j = word.length() - 1;
		while (true) {
			while (word.charAt(i) == ' ') ++i;
			while (word.charAt(j) == ' ') --j;
			if (word.charAt(i) != word.charAt(j)) return false;
			if (j - i < 2) return true;
			++i;
			--j;
		}
	}

	public static int getAge(String[] names, int[] ages, String name) {
		for (int i = 0; i < names.length; ++i) {
			if (names[i].equals(name)) return ages[i];
		}
		return -1;
	}

	public static int countWords(String s, char c) {
		/*
		s = s.strip();
		int count = 0;
		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) == c) {
				++count;
				while (i < s.length() && s.charAt(i) != ' ') ++i; // jump to next whitespace
				while (i < s.length() && s.charAt(i) == ' ') ++i; // jump to next word
				--i; // to account for the for loop increment
			}
		}
		return count;
		*/

		// forgot about split method

		int count = 0;
		String[] words = s.split("\\s+");
		for (int i = 0; i < words.length; ++i) {
			if (words[i].indexOf(c) != -1) ++count;
		}
		return count;
	}

}
