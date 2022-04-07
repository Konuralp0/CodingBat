package Questions;

import java.util.Arrays;

public class swapEnds_Arrays {

	public static void main(String[] args) {

		int[] nums = { 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(Arrays.toString(swapEnds(nums)));

	}

	public static int[] swapEnds(int[] nums) {
		if (nums.length > 1) {
			int i = nums[nums.length - 1];
			nums[nums.length - 1] = nums[0];
			nums[0] = i;
		}

		return nums;
	}

}
