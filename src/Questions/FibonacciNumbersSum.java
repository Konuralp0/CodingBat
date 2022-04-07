package Questions;

import java.util.Arrays;

public class FibonacciNumbersSum {
	public static void main(String[] args) {

		int[] fibNumbers = new int[6];

		fibNumbers[0] = 1;
		fibNumbers[1] = 2;
		fibNumbers[2] = 3;

		for (int i = 3; i <= 5; i++) {
			fibNumbers[i] = fibNumbers[i - 1] + fibNumbers[i - 2];
			System.out.println(Arrays.toString(fibNumbers));
		}
	

		int sum = 0;
		for(Integer each: fibNumbers) {
			if(each%2 == 0) {
				sum = sum + each;
			}
		}
		
		System.out.println(sum);
		
		
	}

}
