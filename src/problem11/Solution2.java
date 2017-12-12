package problem11;

public class Solution2 {

	public static void main(String[] args) {
		int[] arr = new int[1500001];
		for (int i = 0; i < 1500001; i++) {
			arr[i] = 1500000 - i;
		}
		
		long startTime=System.currentTimeMillis();
		System.out.println(maxArea(arr));
		System.out.println(System.currentTimeMillis()-startTime);
	}

	public static int maxArea(int[] height) {
		int max = 0, maxHeight = 0;
		for (int i = 0; i < height.length - 1; i++) {
			if (height[i] > maxHeight) {
				maxHeight = height[i];
			} else {
				continue;
			}
			for (int j = i + 1; j < height.length; j++) {
				int cWidth = j - i;
				int cHeight = height[j] > height[i] ? height[i] : height[j];
				if (cWidth * cHeight > max) {
					max = cWidth * cHeight;
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