package Number;

public class Test {
    public static void main(String[] args) {
        FractionNumber num1 = new FractionNumber(1,3);
        FractionNumber num2 = new FractionNumber(1,2);

        System.out.println(num1.sum(num2).toString());
        System.out.println(num1.deg(num2).toString());
        System.out.println(num1.mult(num2).toString());
        System.out.println(num1.sub(num2).toString());
    }
}
