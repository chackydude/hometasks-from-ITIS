import java.awt.*;

public class Cat implements Comparable<Cat> {
    private int tailLength;
    private Color woolColor;

    // constructor
    public Cat(int tail, Color wool) {
        this.tailLength = tail;
        this.woolColor = wool;
    }

    // compare
    @Override
    public int compareTo(Cat o) {
        if (this.tailLength == o.tailLength &&
            this.woolColor == o.woolColor) {
            return 0;
        } else if (this.tailLength > o.tailLength){
            return 1;
        } else return -1;
    }
}
