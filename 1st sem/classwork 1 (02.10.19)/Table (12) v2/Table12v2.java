public class Table12v2 {
	public static void main(String[] args) {
		if (args.length == 1) {
			int n = Integer.parseInt(args[0]);
			for (int i = 1; i <= 9; i++) {
				for (int j = 1; j<=n; j++) {
					int maxMult = j*9 + 1;
					//add variable to string? replace "10" to "maxMult"
					System.out.printf("%-10s", j + "*" + i + "=" + i*j);
			};
			System.out.printf("%n");
			};			
		} else   {
			System.out.println("Enter one positive argument");
		}
	}
}