import java.util.Scanner;
public class Parentheses9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();;

		boolean flag = true;
		int counter1 = 0,
			counter2 = 0,
			counter3 = 0;

		for (int i = 0; i < str.length(); i++) {

			switch (str.charAt(i)) {
				case ('('): 
					counter1++;
					break;
				case ('['):
					counter2++;
					break;
				case ('{'):
					counter3++;
					break;
			};

			switch (str.charAt(i)) {
				case (')'): 
					counter1--;
					break;
				case (']'):
					counter2--;
					break;
				case ('}'):
					counter3--;
					break;
			};

			if (counter1 < 0 || counter2 < 0 || counter3 < 0) {
				flag = false;
				System.out.println(false);
				break;
			};
		};
		if (flag) {
			System.out.println(counter1 == 0 && counter2 == 0 && counter3 == 0);
		};
	};
}

// скобочный баланс