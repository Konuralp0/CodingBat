package Questions;

public class alarmClock {
	public static void main(String[]args) {
		
		
		
	System.out.println(alarmClock(5,true));	
		
		
	}
	public static String alarmClock(int day, boolean vacation) {
		  String newS;
		  
		  boolean haftaIciNoVac = ((day == 1 || day ==2 || day == 3 || day ==4 || day == 5) && vacation == false); 
		  boolean haftaSonuNoVac = ((day == 6 || day == 0)&& vacation == false);
		  boolean haftaIciVac =  ((day == 1 || day ==2 || day == 3 || day ==4 || day == 5) && vacation == true);
		  boolean haftaSonuVac = ((day == 6 || day == 0) && vacation == true);
		  
		  if(haftaIciNoVac){
		    newS = "7:00";
		  }else if(haftaSonuNoVac){
		    newS = "10:00";
		  }else if(haftaIciVac){
		     newS = "10:00";
		  }else{
		    newS = "off";
		  }

		  return newS;
		}

}
