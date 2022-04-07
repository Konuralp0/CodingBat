package Questions;

public class make2_Array {

	public static void main(String[] args) {
		

	}
	public int[] make2(int[] a, int[] b) {
		  int[] myArray = new int[2];
		  int aUzunluk = a.length;
		  int bUzunluk = b.length;
		  boolean aUzun = a.length >=2;
		  boolean aOrta = a.length ==1;
		  
		  if(aUzun){
		    myArray[0] = a[0];
		    myArray[1] = a[1];
		  }else if(aOrta){
		    myArray[0] = a[0];
		    myArray[1] = b[0];
		  }else{
		    myArray[0] = b[0];
		    myArray[1] = b[1];
		    
		  }

		  return myArray;
		}

}
