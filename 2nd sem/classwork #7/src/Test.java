import java.io.File;
import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Honor\\Documents\\GitHub\\home-tasks-from-KFU\\2nd sem\\classwork #7\\src\\text");

        Student student1 = new Student();
        SerializationNew.write(file, student1);
        System.out.println(SerializationNew.read(file));
        Student student2 = new Student("Dan");
        SerializationNew.write(file, student2);
        System.out.println(SerializationNew.read(file));
        Student student3 = new Student(1984);
        SerializationNew.write(file, student3);
        System.out.println(SerializationNew.read(file));
        Student student4 = new Student("Bob", 1991);
        SerializationNew.write(file, student4);
        System.out.println(SerializationNew.read(file));
    }
}
