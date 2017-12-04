package problem5;

import java.util.HashMap;
import sun.security.util.Length;

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

public class Solution1 {

	public int longestPalindrome(String s) {
		System.out.println(s);
		HashMap<Character, Integer> cMap = new HashMap<Character, Integer>();
		int maxLen = 0;
		String maxPalindromicSubString = "", curPalindromicSubString = "";
		for (int i = 0, j = 0; i < s.length(); i++) {
			if (cMap.keySet().contains(s.charAt(i))) {
				int len = i - cMap.get(s.charAt(i));
				if (j < len) {
					j += 1;
					curPalindromicSubString+=s.charAt(i);
				} else {
					j = len;
					curPalindromicSubString=s.substring(cMap.get(s.charAt(i)),i);
					System.out.println(curPalindromicSubString);
				}
			} else {
				j++;
				curPalindromicSubString += s.charAt(i);
			}
			if (maxPalindromicSubString.length() < curPalindromicSubString.length()) {
				maxPalindromicSubString = curPalindromicSubString;
			}
			if (maxLen < j) {
				maxLen = j;
			}
			cMap.put(s.charAt(i), i);
		}
//		System.out.println(maxPalindromicSubString);
		return maxLen;
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