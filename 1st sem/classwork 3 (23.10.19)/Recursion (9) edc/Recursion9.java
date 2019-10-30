import java.util.Scanner;
public class Recursion9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String strInput = input.nextLine();
		StringBuilder str = new StringBuilder(strInput);

		boolean flag = true;
		int i = 0;

		while (i < str.length()-1) {
			if (str.charAt(i) == '(') {
				findPare(str, i);
			};
			i++;
		};
		for (i = 0; i<str.length(); i++) {
			if (str.charAt(i) != '(' && str.charAt(i) != ')'){
				continue;
			} else {
				flag = false;
				break;
			}
		}
		System.out.println(flag);
}

	public static void findPare(StringBuilder str, int i) {
		int k = i;
		boolean flag = true;
		while (flag && k <str.length()) {
			if (str.charAt(k) == '(') {
				findPare(str, k+1);
			};
			if (str.charAt(k) != ')') {
				k++;
			};
			if (str.charAt(k) == ')') {
				str.deleteCharAt(k);
				str.deleteCharAt(i);
				flag = false;
			}
		}
	}

	// public static void findPare(StringBuilder str, int i) {
	// 	int strLen = str.length();
	// 	boolean flag = true;
	// 	int k = i; // запомнили начальное значение i
	// 	while (flag) { // удаляем символы до открывающей скобки
	// 		if (str.charAt(k) != '(') {
	// 			str.deleteCharAt(k);
	// 			k--;
	// 		} else {
	// 			str.deleteCharAt(k);
	// 			break;
	// 		}
	// 	};
	// 	if (str.length() == strLen - i) { // если не найдена открывающая скобка
	// 		System.out.println("not balanced");
	// 		System.exit(0);
	// 	};
	// 	i = k;
	// 	findPare(str, i);
	// }

}