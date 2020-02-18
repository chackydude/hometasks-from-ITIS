package Number;

public interface Number<T> {
    public T sum(T obj);
    public T deg(T obj);
    public T sub(T obj);
    public T mult(T obj);
}

// HW : TODO 1) Написать 2 компаратора
//      TODO 2) Реализовать сортировку пузырьком используя компараторы
//      TODO 3) Написать интерфейс public interface Number<T>
//                                  public T sum(T obj);
//      TODO 4) Глянуть API Comparable, Wildcards etc
//      TODO 5) Паттерн "стратегия"