package problem3;

import java.util.HashSet;
import java.util.Set;

public class Solution8 implements ISolution {

	@Override
	public int lengthOfLongestSubstring(String s) {
		Set<Character> set = new HashSet<Character>();
		int maxLen = 0;
		for (int i = 0, j = 0; i < s.length(); i++) {
			if (!set.contains(s.charAt(i))) {
				set.add(s.charAt(i));
			} else {
				if (maxLen < set.size())
					maxLen = set.size();
				while (set.contains(s.charAt(i))) {
					set.remove(s.charAt(j++));
				}
			}
		}
		return maxLen > set.size() ? maxLen : set.size();
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