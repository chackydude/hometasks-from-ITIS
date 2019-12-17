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

    public double getModule() {
        return module;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}