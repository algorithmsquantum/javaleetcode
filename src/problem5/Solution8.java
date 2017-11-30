package problem5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution8 {
	public static void main(String[] args) {
		String longestPalindrome = longestPalindrome("babadada");
		System.out.println(longestPalindrome); //=======================================================================
	}
	
	public static String longestPalindrome(String s) {
		HashMap<Character, List<Integer>> cMap = new HashMap<>();
		String palindromeString = "" + s.charAt(0);
		for (int i = 0; i < s.length(); i++) {
			if (cMap.containsKey(s.charAt(i))) {
				List<Integer> list = cMap.get(s.charAt(i));
				list.add(i);
				for (int k = 0; k < list.size(); k++) {
					Integer index = list.get(k);
					int m = i, n = index;
					boolean flag = true;
					while (m > n) {
						if (s.charAt(--m) != s.charAt(++n)) {
							flag = false;
						}
					}
					if (flag) {
						if (palindromeString.length() <= i + 1 - index) {
							palindromeString = s.substring(index, i + 1);
						}
					}
				}

			} else {
				ArrayList<Integer> arrayList = new ArrayList<>();
				arrayList.add(i);
				cMap.put(s.charAt(i), arrayList);
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