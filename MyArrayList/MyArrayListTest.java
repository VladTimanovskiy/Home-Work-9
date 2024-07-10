package module9.MyArrayList;

public class MyArrayListTest {
    public static void main(String[] args) {
    MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Joseph");
        myArrayList.add("Maria");
        myArrayList.add("Sem");
        myArrayList.add("John");
        System.out.println("myArrayList.size() = " + myArrayList.size());
        myArrayList.remove(1);
        System.out.println("myArrayList.get(0) = " + myArrayList.get(0));
        myArrayList.clear();
        System.out.println("myArrayList.size() = " + myArrayList.size());
    }
}
