package Questions;

public class array123 {

	public static void main(String[] args) {

	}

	public static boolean array123(int[] nums) {
		boolean isArray = false;
		for (int i = 0; i <= nums.length - 3; i++) {
			if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
				isArray = true;
			}

		}

		return isArray;
	}

}
