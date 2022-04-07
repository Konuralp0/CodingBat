package Questions;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		
		String str = scan.nextLine();
		
		System.out.println(palindrome(str));

	}

	public static boolean palindrome(String str) {
		boolean palinDrome;

		String str2 = "";

		for (int x = 1; x <= str.length(); x++) {

			str2 = str2 + str.charAt(str.length() - x);

		}
		if (str2.equalsIgnoreCase(str))

		{
			palinDrome = true;
		} else {
			palinDrome = false;
		}

		return palinDrome;
	}
}
