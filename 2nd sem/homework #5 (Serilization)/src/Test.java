import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Dan", "male", 1984, 902));
        students.add(new Student("Bob", "male", 1991, 903));
        students.add(new Student("Lia", "female", 2000, 901));
        students.add(new Student("Hermina", "female", 1999, 904));

        File file = new File("C:\\Users\\Honor\\Documents\\GitHub\\home-tasks-from-KFU\\2nd sem\\homework #5 (Serilization)\\src\\text");

        Serilization.write(file, students);
        ArrayList<Student> result = Serilization.read(file);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
