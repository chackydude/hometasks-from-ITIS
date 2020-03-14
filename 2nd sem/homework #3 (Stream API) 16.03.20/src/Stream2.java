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
//      get() берет value у Optional, Optional - контейнер для value
        list1.stream().filter((num) -> num > max).forEach(System.out::println);
/*      :: - оператор квадроточие, позволяет получить ссылку на метод, указанный в правой части, класса, указанного в левой
        Компилятор выводит тип ссылки из контекста и приводит её к соответствующему функциональному интерфейсу.
        В частности метод forEach принимает Consumer<? super T>, к нему и будет приведена ссылка на метод println,
        возвращаемая выражением System.out::println
 */
        list1.stream().filter((num) -> num > list2.stream().max(Integer::compareTo).get()).forEach(System.out::println);
        //TODO будет ли каждый раз запускаться поток list2.stream
    }
}
