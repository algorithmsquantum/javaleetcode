package problem5;

public class Solution12 {
	public static void main(String[] args) {
		String string = "dddddd";
		//		String string = "anana";

		String longestPalindrome = longestPalindrome(string);
		System.out.println(longestPalindrome);
	}

	//	static int count;
	public static String longestPalindrome(String s) {
		String palindromeString = "" + s.charAt(0);

		if (s.length() < 5) {
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

		//		aabaa
		int length = s.length();
		int n = length / 2, m = n + 1;
		while (n > 0) {
			int x = n - 1, y = n + 1;
			while (x >= 0 && y < s.length()) {
				System.out.println(x + "----" + y);
				if (s.charAt(x) != s.charAt(y)) {
					break;
				}
				x--;
				y++;
			}
			if (palindromeString.length() < y - x - 1) {
				palindromeString = s.substring(x + 1, y);
			}
			n--;
			if (palindromeString.length() > n * 2) {
				break;
			}
		}

		while (m < length) {
			int x = m, y = m + 1;
			while (x >= 0 && y < length) {
				if (s.charAt(x) != s.charAt(y)) {
					break;
				}
				x--;
				y++;
			}
			if (palindromeString.length() < y - x - 1) {
				palindromeString = s.substring(x + 1, y);
			}
			m++;
			if (palindromeString.length() > (length - m) * 2) {
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