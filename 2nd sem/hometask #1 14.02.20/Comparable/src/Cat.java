import java.awt.*;

public class Cat implements Comparable<Cat> {
    private int tailLength;
    private int weight;

    // constructor
    public Cat(int tail, int weight) {
        this.tailLength = tail;
        this.weight = weight;
    }

    // compare
    @Override
    public int compareTo(Cat o) {
        if (this.tailLength == o.tailLength &&
            this.weight == o.weight) {
            return 0;
        } else if (this.tailLength >= o.tailLength || this.weight >= o.weight){
            return 1;
        } else return -1;
    }
}
