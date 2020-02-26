import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // list for constructors
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);


        VariableCollection<Integer> varCol = new VariableCollection<>();
        UnvariableCollection<Integer> unvarcol = new UnvariableCollection<>();
        try {
            unvarcol.add(1);
        } catch (UnsupportedOperationException ex) {
            System.out.println("Because it's unvariable.");
        }
        varCol.add(1); // Exception in thread "main" java.lang.ArrayStoreException: java.lang.Integer !
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