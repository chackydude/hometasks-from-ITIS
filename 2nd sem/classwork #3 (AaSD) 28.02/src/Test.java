public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(4);
        list1.add(5);
        System.out.println(list.head);
        list.add(1);
        System.out.println(list.head);
        list.add(2);
        System.out.println(list.head);
        list.addFirst(0);
        System.out.println(list.head);
        list.addFirst(-1);
        System.out.println(list.head);
        list.addAfter(2, 3);
        System.out.println(list.head);
        System.out.println(list.get(4));
        System.out.println(list.size());
        list.merge(list1);
        System.out.println(list.size());
    }
}
