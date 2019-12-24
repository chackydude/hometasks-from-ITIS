public class Task2 {
	public static void main(String[] args) {
		String input = args[0];
		StringBuilder result = new StringBuilder("");
		for (int i = 0; i < input.length(); i++) {
			char symbol = input.charAt(i);
			switch (symbol) {
				case 'a':
				case 'o':
				case 'e':
				case 'y':
				case 'u':
				case 'i':
					result.append(symbol);
					break;
			}
		}
		System.out.println(result.toString());
	}
}