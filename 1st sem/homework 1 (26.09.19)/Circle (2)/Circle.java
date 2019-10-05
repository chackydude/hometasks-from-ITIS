public class Circle {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		System.out.println(Math.round(2 * Math.PI * a));
		System.out.println(Math.round(Math.PI * Math.pow(a,2)));
	}
}
