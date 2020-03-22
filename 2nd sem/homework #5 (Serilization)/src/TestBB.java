import java.io.*;
import java.nio.ByteBuffer;

public class TestBB {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Honor\\Documents\\GitHub\\home-tasks-from-KFU\\2nd sem\\homework #5 (Serilization)\\src\\text");
        int num = 1984;
        String str = "Dan";
        try (FileOutputStream out = new FileOutputStream(file)) {
            ByteBuffer bi = ByteBuffer.allocate(4);
            int size = str.length();
            ByteBuffer bc = ByteBuffer.allocate(str.length()*2);

            bi.putInt(size);
            bi.rewind();
            out.write(bi.array());

            for (int i = 0; i < str.length(); i++) {
                bc.putChar(str.charAt(i));
            }

            out.write(bc.array());

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileInputStream in = new FileInputStream(file)) {
            ByteBuffer bi = ByteBuffer.allocate(4);
            ByteBuffer bc = ByteBuffer.allocate(20);
            StringBuffer name = new StringBuffer();

            // получили длину слова
            bi.put((byte) in.read());
            bi.put((byte) in.read());
            bi.put((byte) in.read());
            bi.put((byte) in.read());
            bi.rewind();
            int size = bi.getInt();

            // 3 - кол-во букв в слове, до длины выводим
            for (int i = 0; i < size; i++) {
                bc.rewind();
                bc.put((byte) in.read());
                bc.put((byte) in.read());
                bc.rewind();
                char c = bc.getChar();
                System.out.println(c);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
