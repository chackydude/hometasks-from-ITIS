import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Student stud1 = new Student(Color.blue, 175);
        Student stud2 = new Student(Color.green, 175);

        System.out.println(stud1.compareTo(stud2));
    }
}
