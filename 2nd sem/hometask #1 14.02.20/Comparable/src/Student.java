import java.awt.*;

public class Student implements Comparable<Student>{
    private int height;

    // constructor
    public Student(int height) {
        this.height = height;
    }

    // compare
    @Override
    public int compareTo(Student o) {
        if (this.height > o.height) {
            return 1;
        } else if (this.height == o.height) {
            return 0;
        } else return -1;
    }
}
