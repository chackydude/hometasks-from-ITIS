import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class IOStream {
    public static void main(String[] args) {
        // Написать программу, которая открывает файл, записывает в него int, потом char (рус букву).
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        int inputInt = sc.nextInt();
        try {
            FileOutputStream out = new FileOutputStream("C:\\Users\\Honor\\Documents\\GitHub\\home-tasks-from-KFU\\2nd sem\\homework #4 (IOStream)\\src\\text.txt");
            out.write(inputString.getBytes());
            out.write(Integer.toString(inputInt).getBytes());
            out.close();

            FileInputStream stream = new FileInputStream("C:\\Users\\Honor\\Documents\\GitHub\\home-tasks-from-KFU\\2nd sem\\homework #4 (IOStream)\\src\\text.txt");
            InputStreamReader in = new InputStreamReader(stream, StandardCharsets.UTF_8);
            int i;
            while((i = in.read()) != -1) {
                    System.out.print((char) i);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
