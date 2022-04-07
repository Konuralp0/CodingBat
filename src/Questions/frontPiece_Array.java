package Questions;

import java.util.Arrays;

public class frontPiece_Array {

	public static void main(String[] args) {
				int[] nums = {10,9,8,7,6,5,4,34,3};
				System.out.println(Arrays.toString(frontPiece(nums)));
	}

	public static int[] frontPiece(int[] nums) {
		int[] myArray;

		if (nums.length >= 2) {
			myArray = new int[2];
			myArray[0] = nums[0];
			myArray[1] = nums[1];

		} else if (nums.length == 1) {
			myArray = new int[1];
			myArray[0] = nums[0];

		} else {
			myArray = new int[0];
		}

		return myArray;

	}
}