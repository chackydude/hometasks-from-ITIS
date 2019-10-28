import java.util.Scanner;

//наименьшее общее кратное - наименьшее число, которе делится на оба без остатка
public class Lcm8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		boolean flag = true;
		int sum1 = number1;
		int sum2 = number2;
		int result = Math.max(number1, number2);

		while (sum1 != sum2) {
			if (sum1 < sum2) {
				sum1 += number1;
			} else {
				sum2 += number2;
			}
		};
		System.out.println(sum1);


		// while (flag) {s
		// 	if ((result % number1 == 0) && (result % number2 == 0)) {
		// 		flag = false;
		// 		System.out.println(result);	
		// 	} else result++;
		// };
	}
}