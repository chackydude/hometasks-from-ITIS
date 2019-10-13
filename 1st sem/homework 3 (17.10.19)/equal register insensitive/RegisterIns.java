public class RegisterIns {
	public static void main(String[] args) {
		String str1 = args[0];
		String str2 = args[1];
		int i = 0;
		str1 = str1.toLowerCase(); // метод toLowerCase() - переводит все жлементы строки в нижний регистр (есть еще toUpperCase)
		str2 = str2.toLowerCase();
		if (str1.length() == str2.length()) {
			while (str1.charAt(i) == str2.charAt(i)) {
				i++;
				if (i == str1.length()) {
					break;
				};
			};
			if (i == str1.length()) {
				System.out.println("equals");
			} else {
				System.out.println("not equals");
			}
		} else System.out.println("not equals"); 
	}
}
