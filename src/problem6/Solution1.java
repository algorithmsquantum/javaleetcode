package problem6;

/**
 *题意误读为偶数行只存放一个值
 */
public class Solution1 {
	public static void main(String[] args) {
		String str = "abcdefghijklmn";
		System.out.println(convert(str, 3));
	}

	public static String convert(String s, int numRows) {
		Character[][] arrs = new Character[s.length() / (numRows + 1) * 2 + 1][numRows];
		for (int i = 0, j = 0, k = 0; i < s.length(); i++) {
			if (k++ == numRows) {
				arrs[++j][numRows / 2] = s.charAt(i);
				j++;
				k = 0;
				continue;
			}
			arrs[j][k - 1] = s.charAt(i);
		}

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