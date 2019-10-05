public class Circle9 {
	public static void main(String[] args) {
		int cx = Integer.parseInt(args[0]);
		int cy = Integer.parseInt(args[1]);
		int r = Integer.parseInt(args[2]);
		int dx = Integer.parseInt(args[3]);
		int dy = Integer.parseInt(args[4]);
		if (args.length == 5 && r > 0) {
			if (((dx - cx)*(dx - cx) + (dy - cy)*(dy - cy)) == r*r) {
					System.out.println("on the border");
				} else if ((((dx - cx)*(dx - cx) + (dy - cy)*(dy - cy)) > r*r)) {
					System.out.println("out of circle");
				} else {
					System.out.println("in the circle");
				};

			} else {
			System.out.println("Enter 5 arguments");
		};
	}
}
