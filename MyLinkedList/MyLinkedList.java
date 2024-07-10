package module9.MyLinkedList;

public class MyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(Object value) {
        Node newNode = new Node(value);

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

        Node currentNode = getNodeAtIndex(index);


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

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Неправильний індекс.");
        }

        Node currentNode = getNodeAtIndex(index);

        return currentNode.data;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private Node getNodeAtIndex(int index) {

        Node currentNode;
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