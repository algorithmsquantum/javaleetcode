package problem5;

import java.util.Arrays;

public class TestShell {

	public static void main(String[] args) {
		Integer[] arr = { 2, 5, 1, 0, 3, 8, 7 };
//		shell_sort(arr);
		insert_sort(arr);
		System.out.println(Arrays.deepToString(arr));
	}

	public static void shell_sort(Integer[] arr) {
		int gap = 1, i, j, len = arr.length;
		int temp;
		while (gap < len / 3)
			gap = gap * 3 + 1; // <O(n^(3/2)) by Knuth,1973>: 1, 4, 13, 40, 121, ...
		for (; gap > 0; gap /= 3)
			for (i = gap; i < len; i++) {
				temp = arr[i];
				for (j = i - gap; j >= 0 && arr[j] > temp; j -= gap)
					arr[j + gap] = arr[j];
				arr[j + gap] = temp;
			}
	}
	
	public static void insert_sort(Integer[]arr) {
		int i,j,tmp;
		for(i=0;i<arr.length;i++) {
			tmp=arr[i];
			for(j=i-1;j>=0&&arr[j]>tmp;j--)
				arr[j+1]=arr[j];
			arr[j+1]=tmp;
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