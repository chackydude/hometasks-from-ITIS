// compare by height
public class HeightStudentComparator implements Comparator <Student>{
    public int compare(Student s1, Student s2) {
        if (s1.getHeight() > s2.getHeight()) {
            return 1;
        } else if (s1.getHeight() < s2.getHeight()) {
            return -1;
        } return 0;
    }
}



// Some tasks from Classwork
// wildcards
// public static <T> void sort(T[] data, Comparator <? super(или extends)> comp) {};

// HW : TODO 1) Написать 2 компаратора
//      TODO 2) Реализовать сортировку пузырьком используя компараторы
//      TODO 3) Написать интерфейс public interface Wildcard.Number<T>
//                                  public T sum(T obj);
//      TODO 4) Глянуть API Comparable, Wildcards etc