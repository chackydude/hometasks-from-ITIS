public class Test {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<Integer>(6);
        for (int i = 1; i < 6; i++) {
            intStack.add(i);
        }
        System.out.println(intStack.peek());
        System.out.println(intStack.amountOfElements);
        System.out.println(intStack.pop());
        System.out.println(intStack.size());
        System.out.println(intStack.peek());
        System.out.println(intStack.pop());
        System.out.println(intStack.peek());
    }
}
