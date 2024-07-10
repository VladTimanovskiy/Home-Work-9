package module9.MyLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("Sophia");
        myLinkedList.add("34");
        myLinkedList.add("Ukraine");
        myLinkedList.add("Josh");
        System.out.println("myLinkedList = " + myLinkedList.size());
        System.out.println(myLinkedList.get(3));
        myLinkedList.remove(1);
        myLinkedList.clear();
    }
}
