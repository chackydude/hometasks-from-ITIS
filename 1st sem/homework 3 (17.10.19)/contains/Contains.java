import java.util.Scanner;
public class Contains{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Firstly enter container");
		String str1 = input.nextLine();
		String str2 = input.nextLine();
		int len = str1.length() - str2.length();
		int k = 0;
		int flag = 0;
		for (int i = 0; i < len - 1; i++) {
			k = 0;
			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(i + j) == str2.charAt(j)) {
					k++;
					if (k == str2.length()) {
						System.out.println(true);
						flag++;
						break;
					};
				}
			}
		}
		if (flag == 0) {
			System.out.println(false);
		}
	}
}