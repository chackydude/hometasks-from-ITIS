public class Table12v2 {
	public static void main(String[] args) {
		if (args.length == 1) {
			int n = Integer.parseInt(args[0]);
			for (int i = 1; i <= 9; i++) {
				for (int j = 1; j<=n; j++) {
					int maxMult = j*9;
					String maxStr = Integer.toString(maxMult);
					int spaces = maxStr.length() + 1;
					System.out.print( j + "*" + i + "=");
					System.out.printf("%-"+ spaces +"s",i*j);
			};
			System.out.printf("%n");
			};			
		} else   {
			System.out.println("Enter one positive argument");
		}
	}
}