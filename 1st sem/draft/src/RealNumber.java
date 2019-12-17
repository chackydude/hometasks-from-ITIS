import java.util.Objects;

public class RealNumber {

    private double numer;
    private double denumer;

    public RealNumber(double numer, double denumer) {
        this.numer = numer;
        this.denumer = denumer;
    }

    public static RealNumber calculateSum(RealNumber rn1, RealNumber rn2) {
        return new RealNumber(rn1.getNumer() * rn2.getDenumer() + rn2.getNumer() * rn1.getDenumer(),
                                rn1.getDenumer() * rn2.getDenumer());
    }

    public static RealNumber calculateMult(RealNumber rn1, RealNumber rn2) {
        return new RealNumber(rn1.getNumer() * rn2.getNumer(),
                rn1.getDenumer() * rn2.getDenumer());
    }

    @Override
    public String toString() {
        return "" + numer + "/" + denumer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RealNumber that = (RealNumber) o;
        return Double.compare(that.numer, numer) == 0 &&
                Double.compare(that.denumer, denumer) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numer, denumer);
    }

    public double getNumer() {
        return numer;
    }

    public double getDenumer() {
        return denumer;
    }
}
