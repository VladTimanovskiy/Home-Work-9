package module9.Stack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Size: " + stack.size());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Size: " + stack.size());
        stack.remove(0);
        System.out.println("Size after remove: " + stack.size());
        stack.clear();
        System.out.println("Size after clear: " + stack.size());
    }
}
