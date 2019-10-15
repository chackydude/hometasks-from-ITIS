import java.util.Scanner;
public class CompareTo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str1 = input.nextLine();
		String str2 = input.nextLine();
		for (int i = 0; ; i++) {
			//if two strings are equal
			if ((i == str1.length()) && (i == str2.length())) {
				System.out.println(0);
				break;
			};
			// if strings have different lengths
			if (str1.length() > str2.length()) {
				System.out.println(1);
				break;
			} else if (str1.length() < str2.length()) {
				System.out.println(-1);
				break;
			}
			// if strings arn't equals, but have equal lengths
			if (str1.charAt(i) != str2.charAt(i)) {
				System.out.println(str1.charAt(i) - str2.charAt(i));
				break;
			} else continue;
		}
	}
}

