package problem5;

import org.junit.Test;

public class TestAll {

	String str="babad";
	
	@Test
	public void test() throws Exception{
		int longestPalindrome = new Solution1().longestPalindrome("fqfefa");
		System.out.println(longestPalindrome);
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