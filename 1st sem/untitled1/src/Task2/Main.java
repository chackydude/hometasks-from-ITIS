package Task2;

public class Main {
    public static void main(String[] args) {
        Money m1 = new Money(10, (byte) 1);
        Money m2 = new Money(11, (byte) 20);
        Money m3 = new Money(10, (byte) 20);
        Money m4 = new Money(5, (byte) 20);
        Money[] testArray = new Money[3];
        testArray[0] = m1;
        testArray[1] = m2;
        testArray[2] = m3;
        System.out.println(Money.calcSum(m1,m2));
        System.out.println(Money.calcDif(m1,m2));
        System.out.println(Money.calcMult(m1,5));
        System.out.println(Money.sravnMoney(m1,m2));
        System.out.println(calcArraySum(testArray));
        System.out.println(checkArray(testArray, m4));
    }

    // метод находящий общую суииу элементов массива из Money
    public static Money calcArraySum(Money[] array) {
        Money result = new Money(0,(byte) 0);
        for (int i = 0; i < array.length; i++) {
            result = Money.calcSum(result, array[i]);
        }
        return result;
    }

    // метод проверяющий наличие суммы, больше заданной
    public static boolean checkArray(Money[] array, Money m) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (Money.sravnMoney(array[i], m) == 1) {
                result = true;
                break;
            }
        }
        return result;
    }
}
