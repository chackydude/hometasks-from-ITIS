public class Table11 {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		if (args.length == 1 && n > 0) {
			for (int i = 1; i <=9 ; i++) {
				for (int j = 1; j<=n; j++) {
					System.out.print(j + "*" + i + "=" + i*j + "  ");
				};
				System.out.println();
			}
		} else {
			System.out.println("Enter one positive argument");
		}
	}
}