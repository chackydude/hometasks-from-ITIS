import java.util.Scanner;
public class Parentheses9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		boolean flag = true;

		// // проверка скобок нерекурсивно
		// int count1 = 0, count2 = 0;

		// for (int i = 0; i < str.length(); i++) {
		// 	switch (str.charAt(i)) {
		// 		case ('('): 
		// 			count1++;
		// 			break;
		// 		case (')'):
		// 			count2++;
		// 			break; 
		// 	};

		// };
		// System.out.println(count1 == count2);

		for (int i = 0; i < str.length(); i++) {
			if (findParenthese(i, str)) {
				continue;
			} else {
				flag = false;
				System.out.println(flag);
				break;
			}
		};
		if (flag) {
			System.out.println(flag);
		};
	}

	// функция поиска споряженных скобок, нашли - true, иначе - false
	public static boolean findParenthese(int i, String str) {
		for (int j = i; j < str.length(); j++) {
			if (str.charAt(i) == '(') {
				switch (str.charAt(j)) {
					case ('('): 
						return findParenthese(j, str);
						break;
					case (')'):
						return true;
						break;
					default: 
						return false;
				};
			};
		};
	}
}
