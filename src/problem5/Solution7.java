package problem5;

import java.util.HashMap;

public class Solution7 {
	public static void main(String[] args) {
		String longestPalindrome = longestPalindrome("abcba");
		System.out.println(longestPalindrome); //=======================================================================
	}

	public static String longestPalindrome(String s) {
		HashMap<Character, Integer> cMap = new HashMap<>();
		int maxLen = 0;
		String maxString = "", curString = "",palindromeString="";
		for (int i = 0, j = 0; i < s.length(); i++) {
			if (cMap.keySet().contains(s.charAt(i))) {
				if (s.charAt(i) == s.charAt(i - 1)) {
					j++;
					curString += s.charAt(i);
				} else {
					int len = i - cMap.get(s.charAt(i));
					if (j < len) {
						j += 1;
						if (curString.charAt(0) == curString.charAt(curString.length() - 1)) {
							curString = curString.substring(1);
						}
						curString += s.charAt(i);
					} else {
						j = len;
						curString = s.substring(cMap.get(s.charAt(i)), i + 1);
					}
				}
			} else {
				j++;
				if (curString.length() > 0 && curString.charAt(0) == curString.charAt(curString.length() - 1)) {
					curString = curString.substring(1);
				}
				curString += s.charAt(i);
			}
			if (maxLen < j) {
				maxLen = j;
			}
			if (maxString.length() < curString.length()) {
				maxString = curString;
			}
			cMap.put(s.charAt(i), i);
		}
		return maxString;
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