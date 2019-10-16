import java.util.Scanner;
public class CompareToIgnore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str1 = input.nextLine();
		String str2 = input.nextLine();
		int sum1 = 0;
		int sum2 = 0;
		int flag = 0;
		for (int i = 0; i < Math.min (str1.length(), str2.length()); i++){

			if (65 <= (str1.charAt(i)) && (str1.charAt(i) <= 90)) {
				sum1 = str1.charAt(i) + 32; 
			} else sum1 = str1.charAt(i);

			if (65 <= (str2.charAt(i)) && (str2.charAt(i) <= 90)) {
				sum2 = str2.charAt(i) + 32;
			} else sum2 = str2.charAt(i);

			if (sum1  !=  sum2) {
				flag = sum1 - sum2;
				System.out.println(flag);
				break;
			};
		}

		if (flag == 0) {
			System.out.println(str1.length() - str2.length());
		}
	}
}



