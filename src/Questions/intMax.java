package Questions;

public class intMax {
	public static void main(String[]args) {
		
		
		
		System.out.println(intMax(8,9,10));
		
		
	}
	
	public static int intMax(int a, int b, int c) {
		  int d;
		  if( a >  b && a >  c){
		    d = a ;
		    
		  }else if( b > a  &&  b > c){
		    d = b;
		    
		  }else{
		    d =  c;
		  }
		  
		  return d;
		}


}
