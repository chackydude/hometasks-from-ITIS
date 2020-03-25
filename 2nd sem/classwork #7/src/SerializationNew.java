import javax.xml.crypto.Data;
import java.io.*;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class SerializationNew {
    public static void main(String[] args) {

    }

    // file - путь
    public static void write(File file, Student student) {
        //  {|id1, id2 ... |0| имя |1| год } num - количество полей студента, id1, id2... - флаги полей
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(file))) {
                // получили поля студента
                int nameFlag = 0;
                int dateFlag = 0;

                String name = student.getName();
                if (name != null) {
                    nameFlag = 1;
                }
                int date = student.getDate();
                if (date != 0) {
                    dateFlag = 1;
                }

                // запись флагов
                out.writeInt(nameFlag);
                out.writeInt(dateFlag);

                // ID имени
                if (nameFlag == 1) out.writeUTF(name);

                // ID года рождения
                if (dateFlag == 1) out.writeInt(date);

                out.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static Student read(File file) {

        Student student = null;
        String name;
        int date;

        try (DataInputStream in = new DataInputStream(new FileInputStream(file))) {
//            if (in.readInt() == 0) {
//                if (in.readInt() == 0) {
//                    student = new Student();
//                } else {
//                    date = in.readInt();
//                    student = new Student(date);
//                }
//            } else if (in.readInt() == 0) {
//                name = in.readUTF();
//                student = new Student(name);
//            } else {
//                name = in.readUTF();
//                date = in.readInt();
//                student = new Student(name, date);
//            }
            int nameFlag = in.readInt();
            int dateFlag = in.readInt();
            if (nameFlag == 0) {
                if (dateFlag == 0) {
                    student = new Student();
                } else {
                    date = in.readInt();
                    student = new Student(date);
                }
            } else if (dateFlag == 0) {
                name = in.readUTF();
                student = new Student(name);
            } else {
                name = in.readUTF();
                date = in.readInt();
                student = new Student(name, date);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return student;
    }
}
