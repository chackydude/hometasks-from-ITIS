public class Test {
    public static void main(String[] args) {
        Paire <Integer, String> obj0 = new Paire<Integer,String>(42, "apples");
        System.out.println(obj0.getType0());
        System.out.println(obj0.getType1());
    }
}

// hw: 1) TODO сделать EndlessArray - дженериком с типом <T> (хоба (T[]) new Object[]; (T) data[i])
//     2) TODO дописать Pare?
//     3) TODO написать 3 класса, реализующих comparable (насчет comparable почитать Java API)
