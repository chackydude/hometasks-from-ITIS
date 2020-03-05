public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list1 = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list1.add(5);
        list1.add(6);
        System.out.println(list.head);
        System.out.println("size of list: " + list.size());
        System.out.println(list1.head);
        System.out.println("size of list1: " + list1.size());
        list.addFirst(0);
        list1.addFirst(4);
        System.out.println(list.head);
        System.out.println(list1.head);
        list1.addAfter(6,7);
        System.out.println("3rd element in the list: " + list.getByIndex(2));
        list1.removeValue(7);
        System.out.println(list1.head);
        list1.removeByIndex(2);
        list.merge(list1);
        System.out.println(list.head);
    }
}
