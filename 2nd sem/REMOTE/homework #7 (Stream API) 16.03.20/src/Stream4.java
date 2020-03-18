import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Stream4 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        String result = map.keySet().stream().reduce((str1, str2) -> str1 + str2).get();

        System.out.println(result);
    }
}
