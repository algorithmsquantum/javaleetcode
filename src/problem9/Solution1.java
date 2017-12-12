package problem9;

public class Solution1 {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE+Integer.MAX_VALUE+100);
		System.out.println(isPalindrome(1147483949));
	}

	public static boolean isPalindrome(int x) {
		int tmp=x;
		if (x < 0)
			return false;
		int rst = 0, remainder;
		while (x > 0) {
			remainder = x % 10;
			x = x / 10;
			rst=rst*10+remainder;
		}
		System.out.println(rst);
		return rst==tmp;
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