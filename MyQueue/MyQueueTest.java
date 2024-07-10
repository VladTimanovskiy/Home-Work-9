package module9.MyQueue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("Size: " + queue.size()); // Out: Size: 3
        System.out.println("Peek: " + queue.peek()); // Out: Peek: 1
        System.out.println("Poll: " + queue.poll()); // Out: Poll: 1
        System.out.println("Size: " + queue.size()); // Out: Size: 2
        queue.clear();
        System.out.println("Size after clear: " + queue.size()); // Out: Size after clear: 0
    }
}
