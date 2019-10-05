public class Table12 {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		if (args.length == 1 && n > 0) {
			for (int i = 1; i <=9 ; i++) {
				for (int j = 1; j<=n; j++) {
					int maxMult = j*9;
					int number = i*j;
					String numberStr = Integer.toString(number);
					String maxStr = Integer.toString(maxMult);
					int spaces = maxStr.length() - numberStr.length() + 1;
					System.out.print(j + "*" + i + "=" + i*j );
					for (int y = 1; y <= spaces; y++) {
						System.out.print(" ");
					}
				};
				System.out.println();
			}
		} else {
			System.out.println("Enter one positive argument");
		}
	}
}

 