import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Stream3 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add("abracadabra");
        
        Character[] vowels = new Character[] {'A', 'E', 'I', 'O', 'U', 'Y', 'a', 'e', 'i', 'o', 'u', 'y'};
        
        long result = set.stream().filter((str) -> {
            int counter = 0;
            for(int i =0; i < str.length(); i++) {
                for (int j = 0; j < vowels.length; j++) {
                    if (str.charAt(i) == vowels[j]) {
                        counter++;
                    }
                }
            }
            return counter > 3;
        }).count();

        System.out.println(result);
    }
}
