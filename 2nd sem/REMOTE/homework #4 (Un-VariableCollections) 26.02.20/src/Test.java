import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        // list for constructors
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // init collections
        VariableCollection<Integer> varCol = new VariableCollection<>(list);
        VariableCollection<Integer> varCol1 = new VariableCollection<>(list);
        InvariableCollection<Integer> unvarcol = new InvariableCollection<>();
        // trying to change Unvariable Collection
        try {
            unvarcol.add(1);
        } catch (UnsupportedOperationException ex) {
            System.out.println("Because it's unvariable.");
        }

        Iterator<Integer> iterator = varCol.iterator();
        System.out.println(varCol.size());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//        System.out.println(iterator.hasNext());
//        varCol.remove(1);

        System.out.println(varCol.equals(varCol1));
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