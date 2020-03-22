import java.io.*;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

public class Serilization {
    // file - путь
    public static void write(File file, ArrayList<Student> collection) {
        try (FileOutputStream out = new FileOutputStream(file)) {
            for (int i = 0; i < collection.size(); i++) {
                // получили объект
                Student student = collection.get(i);
                // буффер для чисел
                ByteBuffer bi = ByteBuffer.allocate(4);
                // буфер для строк (max 10 символов)
                ByteBuffer bs = ByteBuffer.allocate(20);
                // записали длинну коллекции - первый int
                bi.putInt(collection.size());
                out.write(bi.array());
                bi.rewind();

                // получили поля объекта
                String name = student.getName();
                String gender = student.getGender();
                int date = student.getDate();
                int group = student.getGroup();

                // запись имени
                byte[] nameToByte = name.getBytes();
                bs.put(nameToByte);
                out.write(bs.array());
                bs.rewind();

                // запись пола
                byte[] genderToByte = gender.getBytes();
                bs.put(genderToByte);
                out.write(bs.array());
                bs.rewind();

                // запись года
                bi.putInt(date);
                out.write(bi.array());
                bi.rewind();

                // запись группы
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
        try (FileInputStream in = new FileInputStream(file)) {
            // 20 + 20 + 4 + 4
            // буффер для чисел
            ByteBuffer bi = ByteBuffer.allocate(4);
            // буффер для символов
            ByteBuffer bs = ByteBuffer.allocate(2);
            // получили длину коллекции
            for (int j = 0; j < 4; j++) {
                bi.put((byte) in.read());
            }
            bi.rewind();
            int size = bi.getInt();
            bi.rewind();

            for (int i = 0; i < size; i++) {
                // получили имя
                StringBuffer name = new StringBuffer();
                for (int j = 0; j < 10; j++) {
                    // закинули первый символ в буффер
                    bs.put((byte) in.read());
                    bs.put((byte) in.read());
                    bs.rewind();
                    name.append(bs.getChar());
                    bs.rewind();
                }
                String stName = name.toString();
                bs.rewind();
                // получили пол
                StringBuffer gender = new StringBuffer();
                for (int j = 0; j < 10; j++) {
                    // закинули первый символ в буффер
                    bs.put((byte)in.read());
                    bs.put((byte)in.read());
                    bs.rewind();
                    gender.append(bs.getChar());
                    bs.rewind();
                }
                String stGender = gender.toString();
                bs.rewind();
                // получили год
                for (int j = 0; j < 4; j++) {
                    bi.put((byte) in.read());
                }
                bi.rewind();
                int stDate = bi.getInt();
                bi.rewind();
                // получили группу
                for (int j = 0; j < 4; j++) {
                    bi.put((byte) in.read());
                }
                bi.rewind();
                int stGroup = bi.getInt();
                bi.rewind();
                // создали новый объект студента
                Student student = new Student(stName, stGender, stDate, stGroup);
                // добавили в коллекцию
                result.add(student);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }
}
