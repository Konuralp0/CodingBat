package Questions;

public class Multiples35 {

	public static void main(String[] args) {
		
		int toplam = 0;
		
		for(int i =0; i<1000; i++) {
			if(i%3 == 0 && i%5 ==0) {
				toplam++;
			}
			
			
		}
		System.out.println(toplam);
	}

}
