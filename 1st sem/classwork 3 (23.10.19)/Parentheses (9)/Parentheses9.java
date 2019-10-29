import java.util.Scanner;
public class Parentheses9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String strInput = input.nextLine();
		StringBuilder str = new StringBuilder(strInput);

		boolean flag = true;
		// проходим по всей строке
		for (int i = 0; i < str.length(); i++) {
			// если не найдено парной для последней '(' закрывающей ')'
			if (findParenthese2(i, str) == -1) {
				flag = false;
				System.out.println(flag);
				break;
			// если нашли закрывающую ')', о удаляем часть строки от последней '(' до ')'
			} else i = findParenthese2(i, str);
		};
	 // если есть какое-то несоответствие в строке
	 if (flag) {
	 	System.out.println(flag);
	 };
}

// функция, которая ищет для каждой открывающей скобки '(' парную закрывающую ')'
// возвращает саму себя, если найдена еще одна открывающая скобка '('
// возвращает позицию следующую после найденной	парной закрывающей скобки
// возвразщает -1 если парная скобка не найдена

	public static int findParenthese2(int i, StringBuilder str) {
		int output = -1;
		// поиск первого символа '(' 
		if (str.charAt(i) == '(') {
			for (int k = i; k < str.length(); k++) {
				switch (str.charAt(k)) {
					//при нахождении еще одной '(' вызываем функцию опять
					case ('('): 
						output = findParenthese2(k, str);
						break;
					//при нахождении ')' удаляем часть строки от последней '(' до первой ')'
					case (')'):
						str.delete(i, k+1);
						output = i+1;
						break;
					//если к '(' е найдено парной ')', то вывод -1
					default:
						output = -1;
				};
			};
	 	 };

 		return output;
  }
}
