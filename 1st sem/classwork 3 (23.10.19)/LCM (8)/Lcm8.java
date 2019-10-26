import java.util.Scanner;

//наименьшее общее кратное - наименьшее число, которе делится на оба без остатка
public class Lcm8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		boolean flag = true;
		int result = Math.min(number1, number2);

		while (flag) {
			if ((result % number1 == 0) && (result % number2 == 0)) {
				flag = false;
				System.out.println(result);	
			} else result++;
		};
	}
}