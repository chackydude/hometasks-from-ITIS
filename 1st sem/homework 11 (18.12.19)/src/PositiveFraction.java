import java.util.Scanner;

public class PositiveFraction {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int denum = input.nextInt();
        int num = input.nextInt();
        try {
            System.out.println(divisionCheck(denum));
        } catch (WrongDividerException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(markCheckDenum(denum));
        } catch (NegativeDividerException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(markCheckNum(denum));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(checkResult(num, denum));
        System.out.println(checkNum(num));
    }
    // для дроби вида (num / denum)
    public static boolean divisionCheck(int denum) throws WrongDividerException {
        if (denum == 0) {
            throw new WrongDividerException("Деление на ноль!");
        } else return true;
    }

    public static boolean markCheckDenum(int denum) throws NegativeDividerException {
        if (denum < 0) {
            throw new NegativeDividerException("Отрицательный делитель!");
        } else return true;
    }

    public static boolean markCheckNum(int num) throws NegativeNumException {
        if (num < 0) {
            throw new NegativeNumException("Отрицательный числитель!");
        } else return true;
    }

    // результат не дроби (num / denum), a result == ((num^2 + 1) / (denum^2 + 1)) > 0
    public static boolean checkResult(int num, int denum) throws TooBigResultException, TooLittleResultException{
        double result = (num * num + 1)/ (denum * denum);
        if (result > 10) {
            throw new TooBigResultException("Слишком большое знгачение дроби!");
        } else if (result < 5) {
            throw new TooLittleResultException("Слишком маленькое значение дроби!");
        } else return true;
    }

    public static boolean checkNum(int num) throws CheckNumException{
        if (num == 0) {
            throw new CheckNumException("Числитель равен нулю!");
        } else return true;
    }
}
