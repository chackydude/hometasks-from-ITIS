public class RegisterIns2 {
	public static void main(String[] args) {
		String str1 = args[0];
		String str2 = args[1];
		int i = 0;
		if (str1.length() == str2.length()) {
			while ((str1.charAt(i) == str2.charAt(i)) ||
					(Math.max(str1.charAt(i), str2.charAt(i)) - 32 == Math. min(str1.charAt(i), str2.charAt(i)))) {
				i++;
				if (i == str1.length()) {
					break;
				}
			};
			if (i == str1.length()) {
				System.out.println("equals");
			} else {
				System.out.println("not equals");
			}
		} else System.out.println("not equals");
	}
} 

// int code = char // получение 10-ого кода символа 
//(ASCII code, который у строчной и заглавной буквы различается на 32 единицы) 

// Символы являются примитивным типом в Java, что означает, что они не являются сложным объектом. 
// Как следствие, каждый раз, когда вы делаете сравнение между chars, вы прямо сравниваете их значения.