import java.io.*;

public class InputStream {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Honor\\Documents\\GitHub\\home-tasks-from-KFU\\2nd sem\\homework #4 (IOStream)\\src\\text.txt");
        int intInput = 0;
        char charInput = ' ';
        try (FileInputStream in = new FileInputStream(file);){
            // чтение
            intInput = in.read()<<24|intInput;
            intInput = in.read()<<16|intInput;
            intInput = in.read()<<8|intInput;
            intInput = in.read()<<0|intInput;
            charInput = (char) (in.read()<<8|charInput);
            charInput = (char) (in.read()<<0|charInput);
            System.out.println(intInput);
            System.out.println(charInput);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    // подбирая кодировку в Sublime Text вышло что это UTF-16 BE
}
