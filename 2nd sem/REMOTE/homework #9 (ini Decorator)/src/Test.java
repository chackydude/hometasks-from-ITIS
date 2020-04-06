import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Honor\\Documents\\GitHub\\home-tasks-from-KFU\\2nd sem\\REMOTE\\homework #9 (ini Decorator)\\src\\iniTest");
        try(IniOutputStream out = new IniOutputStream(new FileOutputStream(file))) {
            ArrayList<ArrayList<String>> iniInput = new ArrayList<>();
            ArrayList<String> arr1 = new ArrayList<>(Arrays.asList("[config]", "ssd=500", "hdd=500"));
            ArrayList<String> arr2 = new ArrayList<>(Arrays.asList("[data]", "age=20", "height=180"));
            iniInput.add(arr1);
            iniInput.add(arr2);
            out.writeIni(iniInput);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try(IniInputStream in = new IniInputStream(new FileInputStream(file))) {
            ArrayList<ArrayList<String>> result = new ArrayList<>();
            result = in.readIni();
            System.out.println(result);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
