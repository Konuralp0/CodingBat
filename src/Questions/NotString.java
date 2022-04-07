package Questions;

public class NotString {
	public static void main(String[] args) {

	}

	public String notString(String str) {
		String str2;
		String str3 = str.substring(0, 3);
		String str4 = "not";

		if (str3.equals(str4)) {

			str2 = str;

		} else {

			str2 = "not " + str;

		}
		return str2;
	}
}
