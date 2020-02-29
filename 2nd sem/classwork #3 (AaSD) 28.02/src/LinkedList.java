import javax.management.ListenerNotFoundException;

class LinkedList<T> {
    public Node head;
    public int amount;

    // ---- constructor ---
    public LinkedList() {
        this.head = null;
        this.amount = 0;
    }

    // ---- methods -------
    public void add(T value) {
        if (this.head == null) {
            this.head = new Node(value);
        } else {
            Node nextNode;
            nextNode = this.head;
            while (nextNode.next != null) {
                nextNode = nextNode.next;
            }
            nextNode.next = new Node(value);
        }
        this.amount++;
    }

    public void addFirst(T value) {
        Node buffer;
        if (this.head == null) {
            this.head = new Node(value);
        } else {
            buffer = this.head;
            this.head = new Node(value);
            this.head.next = buffer;
        }
        this.amount++;
    }

    public void addAfter(T findValue, T addVal) throws LinkedListOutOfBoundsException{
        Node buffer;
        if (this.head == null) {
            throw new LinkedListOutOfBoundsException("This list is empty");
        } else {
            Node node = this.head;
            while (node.value != findValue) {
                node = node.next;
            }
            buffer = new Node(addVal);
            buffer.next = node.next;
            node.next = buffer;
        }
        amount++;
    }

    public Node getByIndex(int index) {
        if (index >= amount || this.head == null) {
            throw new LinkedListOutOfBoundsException("This index doesn't exist");
        } else {
            Node node = this.head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node;
        }
    }

    public int size() {
        return this.amount;
    }

    public void  removeValue(T value) throws LinkedListOutOfBoundsException {
        if (this.head == null) {
            throw new LinkedListOutOfBoundsException("This list is empty");
        } else {
            Node node = this.head;
            while (node.next.value != value) {
                node = node.next;
            }
            if (node != null) {
                node.next = node.next.next;
            }
        }
    }

    public void  removeByIndex(int index) throws LinkedListOutOfBoundsException{
        if (this.head == null || index >= amount) {
            throw new LinkedListOutOfBoundsException("This index doesn't exist");
        } else {
            Node node = this.head;
            for (int i = 0; i < index-1; i++) {
                node = node.next;
            }
            node.next = node.next.next;
        }
    }

    public void merge(LinkedList list) {
        if (this.head == null) {
            this.head = list.head;
        } else {
            Node node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = list.head;
        }
        this.amount += list.amount;
    }

    // ---- Node Class ----
    private class Node {
        private Node next;
        private T value;
        private int index;

        public Node(T value) {
            this.next = null;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{value : " + this.value + "; next: " + this.next + "}";
        }
    }
}
// TODO: реализовать LinkedList