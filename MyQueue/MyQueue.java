package module9.MyQueue;

public class MyQueue<T> {
    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head; // The first element of the queue
    private Node<T> tail; // The second element of the queue
    private int size; // Size of queue

    // Adds an element to the end of the queue
    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = tail;
        }
        size++;
    }

    // Clear queue
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    // Return the size of queue
    public int size() {
        return size;
    }

    // Return the first element of queue
    public T peek() {
        if (head == null) {
            return null; // The queue is empty
        }
        return head.data;
    }

    // Returns the first element of the queue and removes it
    public T poll() {
        if (head == null) {
            return null; // The queue is empty
        }
        T value = head.data;
        head = head.next;
        if (head == null) {
            tail = null; // If the queue is empty
        }
        size--;
        return value;
    }

}
