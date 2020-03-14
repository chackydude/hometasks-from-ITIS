import java.util.ArrayList;
import java.util.Collection;

public class Stream2 {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(4);
        list1.add(5);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(4);

        long max = list2.stream().max(Integer::compareTo).get();
//      get() берет value у Optional
        list1.stream().filter((num) -> num > max).forEach(System.out::println);
//      будет ли каждый раз запускаться поток list2.stream
//      list1.stream().filter((num) -> num > list2.stream().max(Integer::compareTo).get()).forEach(System.out::println);
    }
}
