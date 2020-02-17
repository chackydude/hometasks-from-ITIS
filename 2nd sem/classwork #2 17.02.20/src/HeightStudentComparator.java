public class HeightStudentComparator implements Comparator <Student>{
    public int compare(Student s1, Student s2) {
        int answer = 0;
        if (s1.getHeight() >= s1.getHeight()) {
            answer = 1;
        }
        return answer;
    }
}
// wildcards
// public static <T> void sort(T[] data, Comparator <? super(или extends)> comp) {};

// HW : 1) Написать 2 копаратора
//      2) Реализовать сортировку пузырьком используя компараторы
//      3) Написать интерфейс public interface Number<T>
//                                  public T sum(T obj);
//      4) Глянуть API Comparable, Wildcards etc