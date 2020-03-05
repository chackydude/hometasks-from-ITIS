package Number;

public class FractionNumber implements Number<FractionNumber>{
    private int numerator;
    private int denumerator;

    //constructor
    public FractionNumber(int numerator, int denumerator) {
        this.numerator = numerator;
        this.denumerator = denumerator;
    }

    // returns sum of two Fraction Numbers
    @Override
    public FractionNumber sum(FractionNumber obj) {
        return new FractionNumber(this.numerator * obj.denumerator + obj.numerator * this.denumerator,
                                  this.denumerator * obj.denumerator);
    }

    // return difference of two Fraction Numbers
    @Override
    public FractionNumber deg(FractionNumber obj) {
        return new FractionNumber(this.numerator * obj.denumerator - obj.numerator * this.denumerator,
                this.numerator * obj.denumerator);
    }

    // returns multiplication of two Fraction Numbers
    @Override
    public FractionNumber mult(FractionNumber obj) {
        return new FractionNumber(this.numerator * obj.numerator, this.denumerator * obj.denumerator);
    }

    // returns quotient of two Fraction Numbers
    @Override
    public FractionNumber sub(FractionNumber obj) {
        return this.mult(new FractionNumber(obj.denumerator, obj.numerator));
    }

    @Override
    public String toString() {
        return this.numerator + "/" + this.denumerator;
    }
}
