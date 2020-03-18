import java.util.ArrayList;
import java.util.Collection;

public class Stream5 {
    public static void main(String[] args) {
        ArrayList<String> col = new ArrayList<>();
        col.add("hello");
        col.add("hey");
        col.add("abracadabra");
        col.add("stream");
        col.add("virtual");

        long result = col.stream().filter((str) -> str.length() > 5).reduce((str1, str2) -> str1 + str2).get().length();
        System.out.println(result);
    }
}
