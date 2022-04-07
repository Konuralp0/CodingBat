package Questions;

public class OZ_Identifier {
	public static void main(String[]args) {
		
//		Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
//
//
//				startOz("ozymandias") → "oz"
//				startOz("bzoo") → "z"
//				startOz("oxx") → "o"
//		
		
		System.out.println(startOz("zoymaniac")); 
		
	}
	public static String startOz(String str) {
		  char firstChar = str.charAt(0);
		  char secondChar = str.charAt(1);
		  int firstCharAscii = (int)firstChar;
		  int secondCharAscii = (int) secondChar;
		  String oz = "";
		  
		  if((firstCharAscii == 79 || firstCharAscii == 111) && (secondCharAscii==90 || secondCharAscii==122)){
		     oz= firstChar +""+ secondChar;
		    
		  
		    
		  }else if((firstCharAscii == 79 || firstCharAscii == 111) && (secondCharAscii!=90 || secondCharAscii!=122)){
		     oz = firstChar+"";
		    
		    
		  }else if((firstCharAscii != 79 || firstCharAscii != 111) && (secondCharAscii==90 || secondCharAscii==122)){
		     oz= secondChar+"";
		    
		    
		  }
		  
		  return oz; 
		  
		} 

}
