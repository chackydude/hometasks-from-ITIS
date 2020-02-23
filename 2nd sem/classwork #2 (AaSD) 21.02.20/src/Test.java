public class Test {
    public static void main(String[] args) {
        int[] array = new int[7];
        int[] array1 = new int[7];
        for (int i = 0; i < 6; i++) {
            array[i] = i;
        }
        for (int i = 6; i < 12; i++) {
            array1[i-6] = 6;
        }
        SetInt set = new SetInt(array,6);
        SetInt set1 = new SetInt(array1, 6);

        // tests for SetInt ------------------------
        System.out.println("Set toString(): " + set.setToString());
        set.add(5);
        System.out.println("Set add(5): " + set.setToString());
        set.delete(5);
        System.out.println("Set delete(5): " + set.setToString());
        System.out.println("Set has(3): " + set.has(3));
        System.out.println("Set has(6): " + set.has(6));
        System.out.println("Set size(): " + set.size());
        System.out.println("Set: " + set.setToString() + "; Set1: " + set1.setToString());
        System.out.println("Set + Set1 (merge()) = " + set.merge(set1).setToString());

        // tests for MultiSetInt -------------------
        array1 = MultiSetInt.modifyArray(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + ", ");
        }
    }
}
