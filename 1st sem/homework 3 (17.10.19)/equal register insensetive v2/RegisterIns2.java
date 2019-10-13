public class RegisterIns2 {
	public static void main(String[] args) {
		String str1 = args[0];
		String str2 = args[1];
		int i = 0;
		if (str1.length() == str2.length()

			//поработать с юникодами символов

			) {
			while (str1.charAt(i) == str2.charAt(i)) {
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