package Questions;

import java.util.Arrays;

public class unlucky1_Array {

	public static void main(String[] args) {
		
	}
	

	public  boolean unlucky(int[] nums) {
		boolean a;
		  
		  boolean condition1 = (Arrays.binarySearch(nums,1) == 0 && Arrays.binarySearch(nums,3) == 1) || (Arrays.binarySearch(nums,1) == 1 && Arrays.binarySearch(nums,3) == 2);
		  
		  boolean condition2 = (Arrays.binarySearch(nums,1) == (nums.length -3) && Arrays.binarySearch(nums,3) == (nums.length -2)) || (Arrays.binarySearch(nums,1) == (nums.length -2) && Arrays.binarySearch(nums,3) == (nums.length -1));

		  if(condition1 || condition2){
		    a = true;
		  }else{
		    a = false;
		  }
		  return a;
		}

	}


