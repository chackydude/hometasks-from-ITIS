public class Wallis {
	public static void main(String[] args) {
		int k = Integer.parseInt(args[0]);
		if (args.length == 1 && k>0) {
			double p = 1.0;
			for (int i = 2; i <= k; i += 2) {
				p = p*(i*i)/((i-1)*(i+1)); 
			};	
			System.out.println(p * 2);
		} else {
			System.out.println("Enter one positive argument");
	}
}