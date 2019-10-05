public class Progression15 {
	public static void main(String[] args) {
		if (args.length == 3) {
			int a1 = Integer.parseInt(args[0]);
			int a2 = Integer.parseInt(args[1]);
			int k = Integer.parseInt(args[2]);
			int d = a2 - a1;
			System.out.println(a1 + d * (k - 1));
		} else {
			System.out.println("Enter three argumets");
		}
	}
}