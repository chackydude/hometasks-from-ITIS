import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        // list for constructors
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);


        VariableCollection<Integer> varCol = new VariableCollection<>();
        UnvariableCollection<Integer> unvarcol = new UnvariableCollection<>();

        varCol.add(1);
    }
    // Exception in thread "main" java.lang.ArrayStoreException: java.lang.Integer !
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