import java.io.*;

public class OutputStream {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Honor\\Documents\\GitHub\\home-tasks-from-KFU\\2nd sem\\homework #4 (IOStream)\\src\\text.txt");
        int intInput = 1984;
        char charInput = 'Ж';
        try (FileOutputStream out = new FileOutputStream(file);){
            // запись
            out.write(intInput>>24);
            out.write(intInput>>16);
            out.write(intInput>>8);
            out.write(intInput>>0);
            out.write(charInput>>8);
            out.write(charInput>>0);
            FileInputStream in = new FileInputStream(file);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
