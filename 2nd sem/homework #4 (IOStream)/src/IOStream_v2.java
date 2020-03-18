import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class IOStream_v2 {
    public static void main(String[] args) {
        String input = "поехали";
        Integer intInput = 1984;
        File file = new File("C:\\Users\\Honor\\Documents\\GitHub\\home-tasks-from-KFU\\2nd sem\\homework #4 (IOStream)\\src\\text.txt");
        try {
            // перевели строку в массив байтов в кодировке UTF-16
            byte[] arrInput = stringToBytesUTFCustom(input);
            byte[] result = new byte[input.length()*2 + 2];
            // добавление специфичных для UTF-16 начальных байтов
            result[0] = -2;
            result[1] = -1;
            for (int i = 2; i < result.length; i++) {
                result[i] = arrInput[i-2];
            }
            // перевод int в byte
            byte[] arrInput2 = intToBytesUTFCustom(intInput);
            // запись
            FileOutputStream out = new FileOutputStream(file);
            out.write(result);
//            out.write(arrInput2);
            // считывание
            FileInputStream in = new FileInputStream(file);
            int j;
            // хранение файла в байтах
            byte[] bytes = new byte[(int) file.length()];
            int counter = 0;
            while(in.read() != -1) {
                bytes[counter] = (byte) in.read();
                counter++;
            }
            System.out.println(Arrays.toString(bytes));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // code
    public static byte[] stringToBytesUTFCustom(String str) {
        char[] buffer = str.toCharArray();
        byte[] b = new byte[buffer.length << 1];
        for(int i = 0; i < buffer.length; i++) {
            int bpos = i << 1;
            b[bpos] = (byte) ((buffer[i]&0xFF00)>>8);
            b[bpos + 1] = (byte) (buffer[i]&0x00FF);
        }
        return b;
    }

    public static byte[] intToBytesUTFCustom(int num) {
        char[] buffer = Integer.toString(num).toCharArray();
        byte[] b = new byte[buffer.length << 1];
        for(int i = 0; i < buffer.length; i++) {
            int bpos = i << 1;
            b[bpos] = (byte) ((buffer[i]&0xFF00)>>8);
            b[bpos + 1] = (byte) (buffer[i]&0x00FF);
        }
        return b;
    }

    // decode
    public static String bytesToStringUTFCustom(byte[] bytes) {
        char[] buffer = new char[bytes.length >> 1];
        for(int i = 0; i < buffer.length; i++) {
            int bpos = i << 1;
            char c = (char)(((bytes[bpos]&0x00FF)<<8) + (bytes[bpos+1]&0x00FF));
            buffer[i] = c;
        }
        return new String(buffer);
    }
}
