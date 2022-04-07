package Questions;

public class arrayFront9 {

	public static void main(String[] args) {
		
	}
public static boolean arrayFront9(int[] nums) {
		  boolean isArray9 = false;
		  int counter = 0;
		  if(nums.length<=3){
		    for(int i = 0; i<=nums.length -1;i++){
		      if(nums[i]==9){
		        counter++;
		      }
		    }
		    
		    
		  }else{
		   for(int i = 0; i<=3; i++ ){
		     if(nums[i]==9){
		        counter++;
		      }
		      } 
		  }
		  
		  if(counter>=1){
		    isArray9 = true;
		    
		  }
		  
		  return isArray9;
		  
		}

}
