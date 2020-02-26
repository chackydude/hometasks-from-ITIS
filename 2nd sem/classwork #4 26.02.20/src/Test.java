import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        MyCollection <Integer> collection = new MyCollection<>(list);
        for (Object element : collection) {
            System.out.println(element);
        }
    }
}

// написать минимальную немодифицицрованную коллекцию (потом написать модифицированную)
/*
TODO:1) неизменяемая коллекция
TODO:2) изменяемая коллекция

для себя
1) почитать/смотреть про коллекции
2) анонимные классы
3) лямбда-выражения
 */