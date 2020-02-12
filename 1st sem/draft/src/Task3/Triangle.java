package Task3;

import Tasks1.WrongParametersException;

import java.util.Arrays;

// actually Task2
public class Triangle {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private int founding;
    private int lrside;

    // contructor
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) throws WrongParametersException {
        int side1 = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        int side2 = (int) Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        int side3 = (int) Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        if ((side1 == 0) || (side2 == 0) || (side3 == 0)) {
            throw new WrongParametersException("Input parameters are not valid!");
        }
        ;
        if (side1 == side2) {
            this.lrside = side1;
            this.founding = side3;
        } else if (side1 == side3) {
            this.lrside = side1;
            this.founding = side2;
        } else if (side2 == side3) {
            this.lrside = side2;
            this.founding = side1;
        }
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    // method calculates perimeter
    public double calcPerimeter() {
        return this.lrside * 2 + this.founding;
    }

    // method calculates area
    public double calcArea() {
        double p = calcPerimeter();
        return Math.sqrt(p * (p - this.lrside) * (p - this.lrside) * (p - this.founding));
    }

    // override equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return founding == triangle.founding &&
                lrside == triangle.lrside;
    }

    @Override
    public String toString() {
        return "Triangle with sides:" + this.lrside + ", " + this.lrside + ", " + this.founding + "; and angles: " + this.calcAngles();
    }

    // method calculates angles
    public String calcAngles() {
        double[] result = new double[3];
        int side1 = this.lrside;
        int side2 = this.lrside;
        int side3 = this.founding;
        result[0] =  Math.acos((side1 * side1 + side2 * side2 - side3 * side3) / (2 * side1 * side2));
        result[1] =  Math.acos((side2 * side2 + side3 * side3 - side1 * side1) / (2 * side2 * side3));
        result[2] =  Math.acos((side3 * side3 + side1 * side1 - side2 * side2) / (2 * side3 * side1));
        return Arrays.toString(result);
    }
}

// this для объектдляthis.method(объектдляgetter)
