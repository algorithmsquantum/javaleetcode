package problem5;

public class Solution13 {
	public static void main(String[] args) {
		String string = "dd";

		String longestPalindrome = longestPalindrome(string);
		System.out.println(longestPalindrome);
	}

	public static String longestPalindrome(String s) {
		String palindromeString = "" + s.charAt(0);
		int length = s.length();
		if (length < 3) {
			int i = 0;
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
					if ((n = s.lastIndexOf(s.charAt(i), p - 1)) <= (m = i)) {
						break;
					}
				}
				if (palindromeString.length() >= s.length() - ++i) {
					break;
				}
			}
			return palindromeString;
		}

		int n = length / 2;
		while (n > 0 && palindromeString.length() < n * 2) {
			int x = n, y = n - 1;
			while (s.charAt(x) == s.charAt(y)) {
				x--;
				y++;
				if (x < 0 || y >= length) {
					break;
				}
			}
			if (y - x - 1 > palindromeString.length()) {
				palindromeString = s.substring(x + 1, y);
				System.out.println("1>>>>>" + palindromeString);
			}
			n--;
		}

		n = length / 2;
		while (n < length && palindromeString.length() < (length - n) * 2) {
			int x = n, y = n - 1;
			while (s.charAt(x) == s.charAt(y)) {
				x--;
				y++;
				if (x < 0 || y >= length) {
					break;
				}
			}
			if (y - x - 1 > palindromeString.length()) {
				palindromeString = s.substring(x + 1, y);
				System.out.println("2>>>>>" + palindromeString);
			}
			n++;
		}

		n = length / 2;
		while (n > 0 && palindromeString.length() < n * 2 + 1) {
			int x = n - 1, y = n + 1;
			while (s.charAt(x) == s.charAt(y)) {
				x--;
				y++;
				if (x < 0 || y >= length) {
					break;
				}
			}
			if (y - x > palindromeString.length()) {
				palindromeString = s.substring(x + 1, y);
				System.out.println("3>>>>>" + palindromeString);
			}
			n--;
		}

		n = length / 2;
		while (n < length-1 && palindromeString.length() < (length - n) * 2 + 1) {
			int x = n - 1, y = n + 1;
			while (s.charAt(x) == s.charAt(y)) {
				x--;
				y++;
				if (x < 0 || y >= length) {
					break;
				}
			}
			if (y - x > palindromeString.length()) {
				palindromeString = s.substring(x + 1, y);
				System.out.println("4>>>>>" + palindromeString);
			}
			n++;
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