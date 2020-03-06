import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.SortedSet;

public class Test {
    public static void main(String[] args) {
        MyComparator comparator = new MyComparator();
        MyNavigableSet<Object> navSet = new MyNavigableSet((Comparator) comparator);

        navSet.add("1");
        navSet.add("6");
        navSet.add("3");
        navSet.add("4");
        navSet.add("8");
        navSet.add("7");

        System.out.println(navSet.toString());
        System.out.println(navSet.subSet("3", true, "7",true));
        System.out.println(navSet.headSet("3", true));
        System.out.println(navSet.tailSet("4", true));
    }
}
