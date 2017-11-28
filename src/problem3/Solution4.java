package problem3;

import java.util.HashSet;
import java.util.Set;

public class Solution4 implements ISolution {

	@Override
	public int lengthOfLongestSubstring(String s) {
		Set<Character>set=new HashSet();
		char[] charArray = s.toCharArray();
		int maxLen=0;
		for(int i=0,j=0;i<charArray.length;i++) {
			if (!set.contains(charArray[i])) {
				set.add(charArray[i]);
			}else {
				set.remove(charArray[i]);
			}
		}
		System.out.println(set);
		return 0;
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