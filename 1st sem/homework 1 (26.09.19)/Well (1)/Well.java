public class Well {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		System.out.println(Math.round(9.8 * Math.pow(a,2) / 2));
	}
}
