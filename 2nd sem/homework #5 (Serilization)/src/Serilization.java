import java.io.*;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

public class Serilization {
    // file - путь
    public static void write(File file, ArrayList<Student> collection) {
        // | длина коллекции {| длина имени | пол | год | группа |} * на количество объектов
        try (FileOutputStream out = new FileOutputStream(file)) {
            // буффер для чисел
            ByteBuffer bi = ByteBuffer.allocate(4);
            // записали длинну коллекции - первый int1
            bi.putInt(collection.size());
            out.write(bi.array());
            bi.rewind();
            for (int i = 0; i < collection.size(); i++) {
                // получили объект
                Student student = collection.get(i);
                // получили поля объекта
                String name = student.getName();
                int sizeName = name.length();
                char gender = student.getGender();
                int date = student.getDate();
                int group = student.getGroup();
                // запись имени
                // буфер для строки
                ByteBuffer bc = ByteBuffer.allocate(name.length()*2);
                // запись длины имени - второй int2
                bi.putInt(sizeName);
                out.write(bi.array());
                bi.rewind();
                // запись имени набор char длинной int2
                for (int j = 0; j < sizeName; j++) {
                    bc.putChar(name.charAt(j));
                }
                bc.rewind();
                out.write(bc.array());
                bc.rewind();
                //запись пола
                bc.putChar(gender);
                out.write(bc.array()[0]);
                out.write(bc.array()[1]);
                bc.rewind();
                //запись года
                bi.putInt(date);
                out.write(bi.array());
                bi.rewind();
                //запись группы
                bi.putInt(group);
                out.write(bi.array());
                bi.rewind();

                out.flush();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<Student> read(File file) {
        ArrayList<Student> result = new ArrayList<>();
        char gender;
        int date;
        int group;

        try (FileInputStream in = new FileInputStream(file)) {
            // буффер для чисел
            ByteBuffer bi = ByteBuffer.allocate(4);
            // получили длину коллекции
            for (int j = 0; j < 4; j++) {
                bi.put((byte) in.read());
            }
            bi.rewind();
            int size = bi.getInt();
            bi.rewind();

            for (int i = 0; i < size; i++) {
                // чтение имени
                // получили длину имени
                for (int j = 0; j < 4; j++) {
                    bi.put((byte) in.read());
                }
                bi.rewind();
                int nameSize = bi.getInt();
                bi.rewind();

                // буффер для name
                ByteBuffer bc = ByteBuffer.allocate(nameSize * 2);
                StringBuffer name = new StringBuffer();

                for (int j = 0; j < nameSize; j++) {
                    bc.rewind();
                    bc.put((byte) in.read());
                    bc.put((byte) in.read());
                    bc.rewind();
                    char c = bc.getChar();
                    name.append(c);
                }
                // чтение пола
                bc.rewind();
                bc.put((byte)in.read());
                bc.put((byte)in.read());
                bc.rewind();
                gender = bc.getChar();
                //чтение года
                bi.rewind();
                for (int g = 0; g < 4; g++) {
                    bi.put((byte)in.read());
                }
                bi.rewind();
                date = bi.getInt();
                bi.rewind();
                //чтение группы
                for (int g = 0; g < 4; g++) {
                    bi.put((byte)in.read());
                }
                bi.rewind();
                group = bi.getInt();
                bi.rewind();

                // создание нового объекта
                Student student = new Student(name.toString(), gender, date, group);

                // добавили в коллекцию
                result.add(student);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }
}
