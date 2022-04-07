package Questions;

public class delDel {

	public static void main(String[] args) {

	}
	public String delDel(String str) {
		  String str1 = "";
		  String returnS ="";
		  
		  if(str.length()>=4){
		  for(int i = 1; i<=3; i++){
		    char indexer = str.charAt(i);
		    str1 = str1 + Character.toString(indexer);
		    }
		  }
		  if(str.length()>4 && str1.equals("del")){
		    String newS = str.substring(0,1);
		    String newS2 = str.substring(4,str.length());
		    returnS = newS + newS2;
		    }else if(str.length() == 4 && str1.equals("del")){
		      String newS = str.substring(0,1);
		      returnS = newS;
		    }else{
		      returnS = str;
		    }
		  
		  return returnS;
		}

}
