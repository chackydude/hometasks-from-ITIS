public class Task1 {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("error");
		} else {
			String s1 = args[0];
			String s2 = args[1];
			String s3 = args[2];
			boolean flag = true;
			//s1 
			if (!s1.equals("street")) {
				flag = false;
			};
			//s2
			if (s2.charAt(0) < 'A' || s2.charAt(0) > 'Z') {
				flag = false;
			}

			for (int i = 0; i < s2.length() - 1; i++) {
				if (s2.charAt(i) > 'z' || s2.charAt(i) < 'A') {
					flag = false;
				}
			}

			if (s2.charAt(s2.length() - 1) != ',') {
				flag = false;
			}
			//s3
			for (int i = 0; i < s3.length(); i++) {
				if (s3.charAt(i) < '0' || s3.charAt(i) > '9') {
					flag = false;
				}
			}

			if (flag) {
				System.out.println("correct input");
			} else {
				System.out.println("error");
			}

			System.out.println(s1 + ' ' + s2 + ' ' + s3);
		}
	}
}