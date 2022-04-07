package Questions;

public class in3050 {
	public static void main(String[]args) {
		
		
		System.out.println(in3050(99,60));
		
		
	}

	public static boolean in3050(int a, int b) {
		  boolean s;
		  boolean condition1 = (a >=30 && a <=40);
		  boolean condition2 = (b >=30 && b <=40);
		  boolean condition3 = (a>=40 && a<=50);
		  boolean condition4 = (b>=40 && b<=50);
		  
		  if((condition1 && condition2) || (condition3 && condition4)){
		    s = true;
		  }else{
		    
		    s = false;
		  }
		  
		  
		  
		  return s;
		}

}
