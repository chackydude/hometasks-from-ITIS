import java.util.Scanner;
public class Check2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int flag = 0; // flag of float number
		int attent = 0; // flag of not-a-number
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '.' || (str.charAt(i) <= 57 && str.charAt(i) >= 48)) {
				if (str.charAt(i) == '.') {
					flag++;
				};
			} else {
				System.out.println("not a number");
				attent++;
				break;
			}
		};
		// check of containing '.' or other characters 
		if (flag == 1 && attent != 1) {
			System.out.println("float"); 
		// check of containing everything beside '.'
		} else if (flag == 0 && attent != 1) {
			System.out.println("integer");
		// check of containing more than one '.'
		} else if (flag > 1) {
			System.out.println("not a number");
		}
	}
}
