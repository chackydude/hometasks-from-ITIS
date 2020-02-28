class LinkedList<T> {
    private Node head;
    private int amount;

    // ---- constructor ---
    public LinkedList() {
        this.head = null;
        this.amount = 0;
    }

    // ---- methods -------
    public void add(T value) {
        Node element = new Node(value);
        if (this.head == null) {
            this.head = new Node(element.value);
        }
        Node nextNode;
        nextNode = this.head.next;
        while (nextNode != null) {
            nextNode = nextNode.next;
        }
        nextNode.next = element;
        amount++;
    }

    public void addFirst(T value) {
        Node buffer1, buffer2;
        buffer1 = this.head;
        while (buffer1.next != null) {
            buffer2 = buffer1.next;
            buffer1.next = buffer1;
            buffer1.next = buffer2;
        }
        this.head = new Node(value);
        amount++;
    }

    public void addAfter(T value) {
        Node element = this.head;
        Node buffer;
        while (element.value != value) {
            element = element.next;
        }
        buffer = element.next.next;
        element.next = new Node(value);
        element.next.next = buffer;
        amount++;
    }

    public Node get(T value) {
        Node element = this.head;
        while (element.value != value) {
            element = element.next;
        }
        return element;
    }
    // ---- Node Class ----
    private class Node {
        private Node next;
        private T value;

        public Node(T value) {
            this.next = null;
            this.value = value;
        }
    }
}
// TODO: реализовать LinkedList