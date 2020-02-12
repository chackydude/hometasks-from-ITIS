import java.awt.*;

public class Student implements Comparable<Student>{
    private Color eyeColor;
    private int height;

    @Override
    public int compareTo(Student o) {
        int answer = 0;
        if (this.eyeColor == o.eyeColor &&
                this.height == o.height) {
            return answer;
        } else if (this.height > o.height) {
            return 1;
        } else return -1;
    }
}
