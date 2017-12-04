package problem5;

public class Solution10 {
	public static void main(String[] args) {
		String string = "aaabaaaa";
		//		for (int i = 0; i < 23; i++) {
		//			string += string;
		//		}

		String longestPalindrome = longestPalindrome(string);
		System.out.println(longestPalindrome);
	}

	public static String longestPalindrome(String s) {
		String palindromeString = "" + s.charAt(0);
		int i = 0, length = s.length();
		while (i < length) {
			int p = 0, m = i, n = s.lastIndexOf(s.charAt(i));
			while (m < n && (palindromeString.length() <= n - m)) {
				p = n;
				while (m < n && s.charAt(m) == s.charAt(n)) {
					m++;
					n--;
				}
				if (m >= n) {
					palindromeString = s.substring(i, p + 1);
					break;
				}
				if ((n = s.lastIndexOf(s.charAt(i), p-1)) <= (m = i)) {
					break;
				}
			}
			if (palindromeString.length() >= s.length() - ++i) {
				break;
			}
		}
		return palindromeString;
	}

}

/*************************************************************
 *
 *
 *
 * This annotation just for code easier (preserve_bottom_margin)
 *
 * U Should remove it when project completed
 *
 *
 *
 *************************************************************/