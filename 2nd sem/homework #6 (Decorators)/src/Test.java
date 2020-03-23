import java.io.*;
import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Honor\\Documents\\GitHub\\home-tasks-from-KFU\\2nd sem\\homework #6 (Decorators)\\src\\text");
        Student student1 = new Student("Dan", 'm', 1984, 902);
        Student student2 = new Student("Lia", 'f', 1999, 901);

        // DataOutput/InputStream
        try (StudentDataOutputStream out = new StudentDataOutputStream(new FileOutputStream(file))) {
            out.writeStudent(student1);
            out.writeStudent(student2);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (StudentDataInputStream in = new StudentDataInputStream(new FileInputStream(file))) {
            System.out.println(in.readStudent());
            System.out.println(in.readStudent());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        //ObjectOutput/InputStream
        try {
            StudentObjectOutputStream out = new StudentObjectOutputStream(new DataOutputStream(new FileOutputStream(file)));
            out.writeStudent(student1);
            out.writeStudent(student2);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            StudentObjectInputStream in = new StudentObjectInputStream(new DataInputStream(new FileInputStream(file)));
            System.out.println(in.readStudent());
            System.out.println(in.readStudent());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
