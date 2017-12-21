package problem14;

public class Solution1 {
	public static void main(String[] args) {
		String[] arr={"a","b"};
		String longestCommonPrefix = longestCommonPrefix(arr);
		
		System.out.println(longestCommonPrefix);
	}

	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		String longestStr = strs[0];
		for (int i = 1; i < strs.length; i++) {
			int min = Math.min(longestStr.length(), strs[i].length());
			int index = 0;
			for (int j = 0; j < min; j++) {
				if (longestStr.charAt(j) == strs[i].charAt(j)) {
					index++;
					continue;
				}
				break;
			}
			if (longestStr.length() == 0) {
				break;
			}
			longestStr = longestStr.substring(0, index);
		}
		return longestStr;
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