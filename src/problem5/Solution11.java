package problem5;

/**
 * ni daye
 */
public class Solution11 {
	public static void main(String[] args) {
		//		String string = "ibvjkmpyzsifuxcabqqpahjdeuzaybqsrsmbfplxycsafogotliyvhxjtkrbzqxlyfwujzhkdafhebvsdhkkdbhlhmaoxmbkqiwiusngkbdhlvxdyvnjrzvxmukvdfobzlmvnbnilnsyrgoygfdzjlymhprcpxsnxpcafctikxxybcusgjwmfklkffehbvlhvxfiddznwumxosomfbgxoruoqrhezgsgidgcfzbtdftjxeahriirqgxbhicoxavquhbkaomrroghdnfkknyigsluqebaqrtcwgmlnvmxoagisdmsokeznjsnwpxygjjptvyjjkbmkxvlivinmpnpxgmmorkasebngirckqcawgevljplkkgextudqaodwqmfljljhrujoerycoojwwgtklypicgkyaboqjfivbeqdlonxeidgxsyzugkntoevwfuxovazcyayvwbcqswzhytlmtmrtwpikgacnpkbwgfmpavzyjoxughwhvlsxsgttbcyrlkaarngeoaldsdtjncivhcfsaohmdhgbwkuemcembmlwbwquxfaiukoqvzmgoeppieztdacvwngbkcxknbytvztodbfnjhbtwpjlzuajnlzfmmujhcggpdcwdquutdiubgcvnxvgspmfumeqrofewynizvynavjzkbpkuxxvkjujectdyfwygnfsukvzflcuxxzvxzravzznpxttduajhbsyiywpqunnarabcroljwcbdydagachbobkcvudkoddldaucwruobfylfhyvjuynjrosxczgjwudpxaqwnboxgxybnngxxhibesiaxkicinikzzmonftqkcudlzfzutplbycejmkpxcygsafzkgudy";
		//		String string = "riirfklkff";
		//		String string = "aaabaaaa";
		String string = "321012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210123210012321001232100123210123";
		//		String string = "jtotjefini";
		//		for (int i = 0; i < 23; i++) {
		//			string += string;
		//		}

		String longestPalindrome = longestPalindrome(string);
		System.out.println(longestPalindrome);
	}

	//	static int count;
	public static String longestPalindrome(String s) {
		String palindromeString = "" + s.charAt(0);
		int i = 0, length = s.length();
		while (i < length) {
			int p = 0, m = i, n = s.lastIndexOf(s.charAt(i));
			while (m < n && (palindromeString.length() <= n - m)) {
				p = n;
				while (m < n && s.charAt(m) == s.charAt(n)) {
					m++;
					n--;
				}
				if (m >= n) {
					palindromeString = s.substring(i, p + 1);
					break;
				}
				//				if ((p - n) * 2 + 1 > palindromeString.length()) {
				{
					int x = n - 1, y = n + 1;
					while (x >= i && y <= p) {
						if (s.charAt(x) != s.charAt(y)) {
							if (palindromeString.length() < y - x - 1) {
								palindromeString = s.substring(x + 1, y);
							}
							break;
						}
						x--;
						y++;
					}
					if (s.charAt(x + 1) == s.charAt(y - 1)) {
						if (palindromeString.length() < y - x - 1) {
							System.out.println(x + "--" + y);
							palindromeString = s.substring(x + 1, y);
						}
					}
				}
				//				}

				//				if ((i - m) * 2 + 1 > palindromeString.length()) {
				{
					int x = m - 1, y = m + 1;
					while (x >= i && y <= p) {
						if (s.charAt(x) != s.charAt(y)) {
							if (palindromeString.length() < y - x - 1)
								palindromeString = s.substring(x + 1, y);
							break;
						}
						x--;
						y++;
					}
					if (s.charAt(x + 1) == s.charAt(y - 1)) {
						if (palindromeString.length() < y - x - 1)
							palindromeString = s.substring(x + 1, y);
					}
					//				}

					if ((n = s.lastIndexOf(s.charAt(i), p-1)) <= (m = i)) {
						System.out.println(n);
						break;
					}
				}
			}
			if (palindromeString.length() >= s.length() - ++i) {
				break;
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