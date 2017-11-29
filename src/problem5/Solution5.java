package problem5;

import java.util.HashMap;

//Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
//
//Example:
//
//Input: "babad"
//
//Output: "bab"
//
//Note: "aba" is also a valid answer.
//
//Example:
//
//Input: "cbbd"
//
//Output: "bb"

/**
 * 以题三理解 , 会错题意
 */
public class Solution5 {
	public static void main(String[] args) {
		String longestPalindrome = longestPalindrome("affegfaadsffgdsjhtrfhs");
		System.out.println(longestPalindrome); //=======================================================================
	}

	public static String longestPalindrome(String s) {
		HashMap<Character, Integer> cMap = new HashMap<>();
		int maxLen = 0;
		String maxString = "", curString = "";
		for (int i = 0, j = 0; i < s.length(); i++) {
			if (cMap.keySet().contains(s.charAt(i))) {
				int len = i - cMap.get(s.charAt(i));
				if (j < len) {
					j += 1;
					curString += s.charAt(i);
				} else {
					j = len;
					curString=s.substring(cMap.get(s.charAt(i))+1,i+1);
				}
			} else {
				j++;
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