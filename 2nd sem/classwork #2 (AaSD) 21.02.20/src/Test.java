public class Test {
    public static void main(String[] args) {
        int[] array = new int[6];
        SetInt set = new SetInt(array, 0);
        for (int i = 0; i < 6; i++) {
            set.add(i);
        }
        System.out.println(set.toString());
        System.out.println(set.amountOfElements);
        System.out.println(set.has(6));
        set.delete(0);
        System.out.println(set.toString());
    }
}
