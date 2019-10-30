// import java.util.Scanner;
// public class Recursion9 {
// 	public static void main(String[] args) {
// 		Scanner input = new Scanner(System.in);
// 		String strInput = input.nextLine();
// 		StringBuilder str = new StringBuilder(strInput);

// 		boolean flag = true;
// 		int i = 0;

// 		while (i < str.length()-1) {
// 			if (str.charAt(i) == '(') {
// 				findPare(str, i);
// 			};
// 			i++;
// 		};
// 		for (i = 0; i<str.length(); i++) {
// 			if (str.charAt(i) != '(' && str.charAt(i) != ')'){
// 				continue;
// 			} else {
// 				flag = false;
// 				break;
// 			}
// 		}
// 		System.out.println(flag);
// }

// 	public static void findPare(StringBuilder str, int i) {
// 		int k = i;
// 		boolean flag = true;
// 		while (flag && k <str.length()) {
// 			if (str.charAt(k) == '(') {
// 				findPare(str, k+1);
// 			};
// 			if (str.charAt(k) != ')') {
// 				k++;
// 			};
// 			if (str.charAt(k) == ')') {
// 				str.deleteCharAt(k);
// 				str.deleteCharAt(i);
// 				flag = false;
// 			}
// 		}
// 	}

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

// }

import java.util.Scanner;
public class Recursion9 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		if ((find(str,0,0))>=0) {
			System.out.println(true);
		} else	{
				System.out.println(false);
		}		
	}

	// функция проверяющая скобочный баланс для каждой пары скобок
	public static int find(String str,int i,int s1) {
		char a;
		while ((i<str.length())&&(i>=0)) {
			a = str.charAt(i);
			// запускаем рекурсивную ф-ию для новой откр. скобки
			if (a=='(') {
				i = find(str,i+1,1);
			}
			// провенрка скобочного баланся для открывающей
			if (a==')') {
				s1=s1-1;
				// если не нашли закр. => аланс не равен 0
				if (s1!=0) {
					return -1;
				}
				// если нашли закрывающий возвращаем позицию щакрывающей
				return i;
			}
			// сли i>0 продолжаем проверку
			if (i>=0) { i++; };
		}
		// если нашел скобку с балансом == 1
		if (s1!=0) {
			return -1;
		}
		// если все норм. то i >= 0, i < 0 => какой-то пары != 0 
		return i;
	}
}