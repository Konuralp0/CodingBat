package Questions;

public class midThree {

	public static void main(String[] args) {

	}

	public int[] midThree(int[] nums) {
		  int[] array = new int[3];
		  if(nums.length>=3){
		    int middle = nums.length/2;
		    array[0] = nums[middle -1];
		    array[1] = nums[middle];
		    array[2] = nums[middle +1];
		    
		    
		  }

		  return array;
		}



}
