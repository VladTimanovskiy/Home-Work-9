package module9.MyLinkedList;

public class MyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(T value) {
        Node<T> newNode = new Node(value);

        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        size++;
    }

    public void remove(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Неправильний індекс");
        }

        Node<T> currentNode = getNodeAtIndex(index);


        if (currentNode.prev != null) {
            currentNode.prev.next = currentNode.next;
        } else {
            head = currentNode.next;
        }


        if (currentNode.next != null) {
            currentNode.next.prev = currentNode.prev;
        } else {
            tail = currentNode.prev;
        }

        size--;

    }
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Неправильний індекс.");
        }

        Node<T> currentNode = getNodeAtIndex(index);

        return currentNode.data;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private Node<T> getNodeAtIndex(int index) {

        Node<T> currentNode;
        if (index < size / 2) {
            currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }

        }else {
            currentNode = tail;
            for (int i = size - 1; i > index; i--) {
                currentNode = currentNode.prev;
            }
        }
        return currentNode;
    }

    static class Node<T> {
    T data;
    Node<T> prev;
    Node<T> next;


    public Node(T data){
        this.data = data;
        this.prev = null;
        this.next = null;
        }

        //public static boolean isEmpty() {
        //return false;
        //}
    }


}