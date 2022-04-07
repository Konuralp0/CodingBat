package Questions;

public class maxTriple_Array {

	public static void main(String[] args) {
		

	}
	public int maxTriple(int[] nums) {
		  int a;
		  int bas = nums[0];
		  int orta = nums[nums.length/2];
		  int son = nums[nums.length-1];
		  boolean basBuyuk = bas > orta && bas>son;
		  boolean ortaBuyuk = orta > bas && orta>son;
		  
		    if(basBuyuk){
		      a = bas;
		    }else if(ortaBuyuk){
		      a = orta;
		    }else{
		      a = son;
		    }

		  return a;
		}


}
