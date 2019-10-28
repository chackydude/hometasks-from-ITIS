import java.util.Scanner;
public class Parentheses9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		boolean flag = true, flag2 = false;

		for (int i = 0; i < str.length(); i++) {
			if (findParenthese2(i, str) == -1) {
				System.out.println(false);
				break;
			}
		}

}

// функция, которая ищет для каждой открывающей скобки '(' парную закрывающую ')'
// возвращает саму себя, если найдена еще одна открывающая скобка '('
// возвращает позицию следующую после найденной	парной закрывающей скобки
// возвразщает -1 если парная скобка не найдена
	public static int findParenthese2(int i, String str) {
		int output = -1;
		if (str.charAt(i) == '(') {
			for (int k = i; k < str.length(); k++) {
				switch (str.charAt(k)) {
					case ('('): 
						output = findParenthese2(i+1, str);
					case (')'):
						output = k+1;
					default:
						output = -1;
				};
			};
	 	 };
 		return output;
  }
}
