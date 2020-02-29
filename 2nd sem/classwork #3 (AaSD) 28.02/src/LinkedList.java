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

    // try-catch my own exception
    public void addAfter(T findValue, T addVal) {
        Node buffer;
        if (this.head == null) {
            //exception
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

    // try-catch my own exception
    public Node get(int index) {
        if (index > amount || this.head == null) {
            return null;
            // exception
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

    // by value
    // try-catch my own exception
    public void  remove(T value) {

    }

    // by index
    // try-catch my own exception
    public void  remove(int index) {

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