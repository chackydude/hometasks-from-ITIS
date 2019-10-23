import java.util.Scanner;
public class Palindrome5 {
	public static void main(String[] args) {
		// StringBuffer str = new StringBuffer("");
		// Scanner input = new Scanner(System.in);
		// str.append(input.nextLine());

		// StringBuffer reverse = new StringBuffer("");
 
 		// 	for (int i = 0; i < str.length(); i++) {
		// 	reverse.insert(0, str.charAt(i));
		// };

		// System.out.println(str == reverse);
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int flag = 0;
		for (int i = 0; i < Math.round(str.length()/2); i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				flag++;
			};
		};

		if (flag > 0) {
			System.out.println(false);
		} else System.out.println(true);
	}
}