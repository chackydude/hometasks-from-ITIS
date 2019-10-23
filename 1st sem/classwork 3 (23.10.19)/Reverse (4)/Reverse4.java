import java.util.Scanner;
public class Reverse4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		while (str.length() == 0) {
			System.out.println("enter string");
			str = input.nextLine();
		};

		/*Класс StringBuffer представляет расширяемые и доступные 
		для изменений последовательности символов, позволяя вставлять 
		символы и подстроки в существующую строку и в любом месте. 
		Данный класс гораздо экономичнее в плане потребления памяти 
		и настоятельно рекомендуется к использованию.*/

		StringBuffer reverse = new StringBuffer("");

		// Метод insert(pos, char) вставляет в StringBuffer на позицию pos символ char (можно boolean, int, float)
 
		for (int i = 0; i < str.length(); i++) {
			reverse.insert(0, str.charAt(i));
		};

		for (int i = 0; i < reverse.length(); i++) {
			System.out.print(reverse.charAt(i));
		};
	}
}