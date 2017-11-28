package problem3;

import java.util.ArrayList;
import java.util.List;

//Given a string, find the length of the longest substring without repeating characters.
//
//Examples:
//
//Given "abcabcbb", the answer is "abc", which the length is 3.
//
//Given "bbbbb", the answer is "b", with the length of 1.
//
//Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
public class Solution1 implements ISolution {

	public int lengthOfLongestSubstring(String s) {
		char[] charArray = s.toCharArray();
		List<Character> cList = new ArrayList<>();
		int maxLen = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (!cList.contains(charArray[i])) {
				cList.add(charArray[i]);
			} else {
				if (maxLen < cList.size())
					maxLen = cList.size();
				int indexOf = cList.indexOf(charArray[i]);
				for (int j = 0; j <= indexOf; j++) {
					cList.remove(0);
				}
				cList.add(charArray[i]);
			}
		}
		return maxLen > cList.size() ? maxLen : cList.size();
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