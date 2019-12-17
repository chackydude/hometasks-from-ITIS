import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double re = inputScanner.nextDouble();
        double im = inputScanner.nextDouble();
        ComplexNumber number1 = new ComplexNumber(re, im);
        ComplexNumber number2 = new ComplexNumber(re, im);
        System.out.println(ComplexNumber.calculateSum(number1, number2).toString());
    }
}
