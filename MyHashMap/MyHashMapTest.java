package module9.MyHashMap;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println("Size: " + map.size());
        System.out.println("Get 'two': " + map.get("two"));
        System.out.println("Remove 'two': " + map.remove("two"));
        System.out.println("Size after remove: " + map.size());
        map.clear();
        System.out.println("Size after clear: " + map.size());
    }
}
