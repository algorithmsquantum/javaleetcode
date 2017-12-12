package problem11;

public class Solution1 {

	public static void main(String[] args) {
		System.out.println(maxArea(new int[] { 1,1,1 }));
	}

	public static int maxArea(int[] height) {
		int max = 0;
		for (int i = 0; i < height.length - 1; i++) {
			for (int j = i + 1; j < height.length; j++) {
				int cWidth = j - i;
				int cHeight = height[j] > height[i] ? height[i] : height[j];
				if (cWidth*cHeight>max) {
					max=cWidth*cHeight;
				}
			}
		}
		return max;
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