package Questions;

import java.util.Arrays;

public class makeMiddle_Arrays {

	public static void main(String[] args) {
		int[] nums = {1,4,5,6,7,3,2,4,};
		System.out.println(Arrays.toString(makeMiddle(nums)));
		
	}
	public static int[] makeMiddle(int[] nums) {
		  int[] newArray = new int[2];
		  
		  if (nums.length == 2){
		    newArray = nums;
		    
		  }else{
		    int a = nums[(nums.length/2)];
		    int b = nums[(nums.length/2) -1];
		    
		    newArray[0] = b;
		    newArray[1] = a;
		    
		    
		    
		  }
		  return newArray;
		}

}
