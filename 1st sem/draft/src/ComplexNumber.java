import java.util.Objects;

public class ComplexNumber {

    private double real;
    private double imaginary;
    private double module = Math.sqrt(real * real + imaginary * imaginary);
    private double angle = Math.acos(real / module);

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // static можно обращаться без создания экземпляра класса
    public static ComplexNumber calculateSum(ComplexNumber cn1, ComplexNumber cn2) {
        return new ComplexNumber(cn1.getReal() + cn2.getReal(), cn1.getImaginary() + cn2.getImaginary());
    }

    public ComplexNumber calculateSum2(ComplexNumber cn) {
        return new ComplexNumber(real + cn.real, imaginary + cn.imaginary);
    }

    public static ComplexNumber calculateMult(ComplexNumber cn1,ComplexNumber cn2) {
        return new ComplexNumber(cn1.getReal() * cn2.getReal() - cn1.getImaginary() * cn2.getImaginary(),
                                    2 * cn1.getReal() * cn2.getImaginary());
    }

    public static ComplexNumber calculatePow(ComplexNumber cn, int pow) {
        ComplexNumber result = new ComplexNumber(cn.getReal(), cn.getImaginary());
        for (int i = 0; i < pow; i++) {
            result = calculateMult(cn, cn);
        }
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        String flag = " + ";
        if (imaginary < 0) {
            flag = "";
        }
        return "" + real + flag + imaginary + "*"   + "i";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Double.compare(that.real, real) == 0 &&
                Double.compare(that.imaginary, imaginary) == 0 &&
                Double.compare(that.module, module) == 0 &&
                Double.compare(that.angle, angle) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imaginary, module, angle);
    }

    public double getModule() {
        return module;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber getPare(ComplexNumber cn) {
        return new ComplexNumber(cn.getReal(), 0 - cn.getImaginary());
    }
}