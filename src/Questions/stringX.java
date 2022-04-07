package Questions;

public class stringX {

	public static void main(String[] args) {
		System.out.println(stringX("xxxxxxxxaxxxxa"));

	}
	public static String stringX(String str) {
		boolean start = str.startsWith("x");
		boolean end = str.endsWith("x");
		String newS = "";
		String newSs= "";

		if(start && end){
		  newS = str.substring(1,str.length()-1);
		  newS.replace("x","");
		  newSs = "x" + newS + "x";
		}else if(start && !end){
		  newS = str.substring(1);
		  newS.replace("x","");
		  newSs = "x" + newS;
		}else if(end && !start){
		   newS = str.substring(0,str.length()-1);
		   newS.replace("x","");
		   newSs =  newS + "x" ;
		}else{
		  newSs = str;
		  newSs.replace("x","");
		}

		  
		  return newSs;
		  
		  
		  
		  
		}
}
