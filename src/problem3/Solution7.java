package problem3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution7 implements ISolution {

	@Override
	public int lengthOfLongestSubstring(String s) {
		   int n = s.length(), ans = 0;
	        int[] index = new int[128];
	        for (int j = 0, i = 0; j < n; j++) {
	        	//取指定字母的位置 , 如果这个字母没有被加入过 , i是0
	            i = Math.max(index[s.charAt(j)], i);
	            ans = Math.max(ans, j - i + 1);
	            //记录字母的位置
	            index[s.charAt(j)] = j + 1;
	        }
	        return ans;
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