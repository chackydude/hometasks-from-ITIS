package Tasks1;

public class Rectangle {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private int x4;
    private int y4;
    private int side1;
    private int side2;

    public Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) throws WrongParametersException {
        int side1 = (int) Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));
        int side2 = (int) Math.sqrt((x1 - x4)*(x1 - x4) + (y1 - y4)*(y1 - y4));
        if (side1 == 0 || side2 == 0) {
            throw new WrongParametersException("Incorrect input. Try again.");
        }
        this.side1 = (int) Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));
        this.side2 = (int) Math.sqrt((x1 - x4)*(x1 - x4) + (y1 - y4)*(y1 - y4));
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }

    public int calcPerimeter() {
        return 2*(this.side1 + this.side2);
    }

    public int calcArea() {
        return this.side1*this.side2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return  side1 == rectangle.side1 &&
                side2 == rectangle.side2;
    }

    @Override
    public String toString() {
        return "Rectangle with sides: " + this.side1 + ", " + this.side2 + '.';
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }
}
