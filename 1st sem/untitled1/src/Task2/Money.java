package Task2;

public class Money {
    private long rub = 0;
    private byte kop = 0;

    public Money(long rub, byte kop) {
        this.rub = rub;
        this.kop = kop;
    }

    @Override
    public String toString() {
        return this.rub + "," + this.kop;
    }

    // метод вычисляющий сумму двух объектов Money (m1 + m2)
    public static Money calcSum(Money m1, Money m2) {
        long sumRub = m1.getRub() + m2.getRub();
        byte sumKop = (byte) (m1.getKop() + m2.getKop());
        if (sumKop >= 100) {
            sumRub++;
            sumKop = (byte) (sumKop % 100);
        }
        return new Money(sumRub, sumKop);
    }

    // метод вычисляющий разность двух объектов Money (m1 - m2)
    public static Money calcDif(Money m1, Money m2) {
        long difRub = m1.getRub() - m2.getRub();
        long difKop = 0;
        // в случае, если разница отрицательная
        if (difRub < 0) return new Money(0, (byte) 0);
        if (m1.getKop() < m2.getKop()) {
            difKop = 100 - m2.getKop() + m1.getKop();
            difRub--;
        }
        return new Money(difRub, (byte) difKop);
    }

    // метод умножения нацелове число m1 * k
    public static Money calcMult(Money m1, int k) {
        long multRub = m1.getRub() * k;
        long multKop = m1.getKop() * k;
        if (multKop >= 100) {
            multRub = multKop / 100;
            multKop = multKop % 100;
        }
        return new Money(multRub, (byte) multKop);
    }

    // метод сравнения m1 и m2; return 1 - если m1>m2; -1 - если m1<m2; 0 - если m1 == m2
    public static int sravnMoney(Money m1, Money m2) {
        if (m1.getRub() > m2.getRub()) {
            return 1;
        } else if (m1.getRub() < m2.getRub()) {
            return -1;
        } else if (m1.getKop() > m2.getKop()) {
            return 1;
        } else if (m1.getKop() < m2.getKop()) {
            return -1;
        } else return 0;
    }

    public void setRub(long rub) {
        if (rub >= 0 && rub <=100) {
            this.rub = rub;
        }
    }

    public void setKop(byte kop) {
        if (kop >= 0 && kop <= 100) {
            this.kop = kop;
        }
    }

    public long getRub() {
        return rub;
    }

    public byte getKop() {
        return kop;
    }
}
