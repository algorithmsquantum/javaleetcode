package problem6;

import java.util.Arrays;

/**
 * 这题貌似有问题 , 跳过
 */
public class Solution2 {
	public static void main(String[] args) {
		String str = "ABCDEFGHIJKLMN";
		System.out.println(convert(str, 4));
	}

	public static String convert(String s, int numRows) {
		if (numRows == 1)
			return s;
		Character[][] arrs = new Character[(2*(s.length() + numRows)-3) / (2 * (numRows - 1))][numRows];
		for (int i = 0, j = 0, k = 0; i < s.length(); i++) {
			if (k++ == numRows) {
				j++;
				k = numRows - 1;
				while (k > (numRows > 2 ? 1 : 0) && i < s.length()) {
					arrs[j][--k] = s.charAt(i++);
				}
				k = 0;
				j++;
				i--;
				continue;
			}
			arrs[j][k - 1] = s.charAt(i);
		}
		
		System.out.println(Arrays.deepToString(arrs));

		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < arrs.length; j++) {
				if (arrs[j][i] != null) {
					stringBuilder.append(arrs[j][i]);
				}
			}
		}
		return stringBuilder.toString();
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