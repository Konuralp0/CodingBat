package Questions;

public class Closest_Ten {
	public static void main(String[]args) {
		
		
		
		
		
		
		
		
	}
	public int close10(int a, int b) {
		  int d = a - 10;
		  int c = b - 10;
		  int dMax = Math.abs(d);
		  int cMax = Math.abs(c);
		  int e; 
		  
		  
		  
		  if(dMax>cMax){
		    e = b;
		    
		  } else if (dMax == cMax){
		    e = 0;
		  }else{
		    e = a;
		    
		  }
		  return e;
		}

}
