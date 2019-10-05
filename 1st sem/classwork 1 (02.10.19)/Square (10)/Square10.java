public class Square10{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		if (args.length == 1) {
			for (int i = 1; i<=n; i++) {
				for (int j = 1; j<=n; j++){
					System.out.print("*");
				};
				System.out.println("*");
			}
		} else {
			System.out.println("Enter only one positive argument");
		};
	}
}