import java.util.Scanner;
public class Parentheses9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();;

		boolean flag = true;
		int counter = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				counter++;
			} else if (str.charAt(i) == ')'){
				counter--;
			};
			if (counter < 0) {
				flag = false;
				System.out.println(false);
				break;
			};
		};
		if (flag) {
			System.out.println(counter == 0);
		};
	};
}

// скобочный баланс