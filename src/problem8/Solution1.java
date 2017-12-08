package problem8;

public class Solution1 {
	public static void main(String[] args) {
		System.out.println(myAtoi("010"));
		int i = 2147483647;
	}

	public static int myAtoi(String str) {
		str = str.replaceAll("\\s*(.*)\\s*", "$1");
		String temp = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				temp += str.charAt(i);
				if (temp.length() > 11) {
					return temp.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
				}
			} else if (str.charAt(i) == '-') {
				if (++count == 2)
					return 0;
				temp = '-' + temp;
			} else if (str.charAt(i) == '+') {
				if (++count == 2)
					return 0;
			} else {
				break;
			}
		}
		try {

			long parseLong = Long.parseLong(temp);
			if (parseLong > Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;
			}
			if (parseLong < Integer.MIN_VALUE) {
				return Integer.MIN_VALUE;
			}
			return (int) parseLong;
		} catch (Exception e) {
			return 0;
		}
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