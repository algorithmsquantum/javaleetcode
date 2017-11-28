package problem3;

import java.util.ArrayList;
import java.util.List;

public class Solution2 implements ISolution {

	@Override
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
				cList = cList.subList(cList.indexOf(charArray[i]) + 1, cList.size());
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