import java.util.Scanner;
public class Parentheses9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();

		// проверка скобок нерекурсивно
		int count1 = 0, count2 = 0;

		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
				case ('('): 
					count1++;
					break;
				case (')'):
					count2++;
					break; 
			};

		};
		System.out.println(count1 == count2);
	}
}