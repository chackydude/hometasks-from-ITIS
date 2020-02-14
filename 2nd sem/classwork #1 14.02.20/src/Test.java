public class Test {
    public static void main(String[] args) {
        // test Stack
        Stack<Integer> intStack = new Stack<Integer>(6);
        for (int i = 1; i < 6; i++) {
            intStack.add(i);
        }
        System.out.println("Элемент снаружи стека: " + intStack.peek());
        System.out.println("Удаляем из стека этот элемент: " + intStack.pop());
        System.out.println("Размер стека на данный момент: " + intStack.size());
        System.out.println("Элемент снаружи стека: " + intStack.peek());
        System.out.println("Удаляем из стека этот элемент: " + intStack.pop());
        System.out.println("Элемент снаружи стека: " + intStack.peek());
        System.out.println(intStack.toString());

        // test Queue
        Queue<Integer> intQueue = new Queue<Integer>(6);
        for (int i = 0; i < 2; i++) {
            intQueue.add(i);
        }
        System.out.println("Первый элемент в очереди: " + intQueue.peek());
        System.out.println("Размер очереди на данный момент: " + intQueue.size());
        System.out.println("Удаляем из очереди этот элемент: " + intQueue.pop());
        System.out.println("Удаляем из очереди этот элемент: " + intQueue.pop());
        System.out.println("Удаляем из очереди этот элемент: " + intQueue.pop());
        System.out.println("Первый элемент в новой очереди: " + intQueue.peek());
        System.out.println("Размер очереди на данный момент: " + intQueue.size());
        System.out.println(intQueue.toString());
    }
}
